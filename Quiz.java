import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        String[] questions = { "What is the main function of a router ?",
                "Which part of the computer is considered the brain ?",
                "What year was Facebook launched ?",
                "Who is known as the father of computer ?",
                "what was the first programming language ?" };

        String[][] options = {
                { "!. Storing files", "2. Encrypting Data", "3. Directing Interney traffic", "4. Managing passwords" },
                { "1. CPU ", "2. Hard Drive ", "3. RAM", "4. GPU" },
                { "1. 2000 ", "2. 2004 ", "3. 2006 ", "4. 2008 " },
                { "1. Steve Jobs ", "2. Bill gates ", "3. Alan TUring", "4. Charles Babbage " },
                { "1. COBOL", "2. C ", "3. FORTRAN ", "4. ASSEMBLY " },
        };

        int[] answers = { 3, 1, 2, 4, 3 };
        int score = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Welcome to the JAVA Quiz Game!");
        System.out.println("******************************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("********");
                System.out.println("CORRECT !");
                System.out.println("********");
                score++;
            } else {
                System.out.println("********");
                System.out.println("WRONG!");
                System.out.println("********");            }
        }

        System.out.println("Your Final Score is : " + score + " out of " + questions.length);

        scanner.close();

    };

}