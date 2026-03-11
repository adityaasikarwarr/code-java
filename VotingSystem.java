import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int votesA = 0;
        int votesB = 0;
        int votesC = 0;
        int choice;

        do {
            System.out.println("\n===== VOTING SYSTEM =====");
            System.out.println("1. Vote for Candidate A");
            System.out.println("2. Vote for Candidate B");
            System.out.println("3. Vote for Candidate C");
            System.out.println("4. Show Results");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                votesA++;
                System.out.println("Vote recorded for Candidate A");
            }

            else if (choice == 2) {
                votesB++;
                System.out.println("Vote recorded for Candidate B");
            }

            else if (choice == 3) {
                votesC++;
                System.out.println("Vote recorded for Candidate C");
            }

            else if (choice == 4) {
                System.out.println("\n===== VOTING RESULTS =====");
                System.out.println("Candidate A : " + votesA + " votes");
                System.out.println("Candidate B : " + votesB + " votes");
                System.out.println("Candidate C : " + votesC + " votes");

                // Finding winner
                if (votesA > votesB && votesA > votesC) {
                    System.out.println("Winner: Candidate A");
                } else if (votesB > votesA && votesB > votesC) {
                    System.out.println("Winner: Candidate B");
                } else if (votesC > votesA && votesC > votesB) {
                    System.out.println("Winner: Candidate C");
                } else {
                    System.out.println("It's a Tie!");
                }
            }

            else if (choice == 5) {
                System.out.println("Exiting Voting System...");
            }

            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}