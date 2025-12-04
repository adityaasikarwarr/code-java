 // number guessing game
 //public class Hello {
//     public static void main(String[] args){
//         Random random = new Random();
//         Scanner scanner = new Scanner(System.in);
//
//         int guess;
//         int attempts = 0;
//         int randomNum = random.nextInt(1 ,11);
//         System.out.println("NUmber guessing game");
//         System.out.println("Guess the number between 1-10: ");
//
//         do{
//             System.out.print("enter a guess: ");
//             guess = scanner.nextInt();
//             attempts++;
//
//             if (guess < randomNum) {
//                 System.out.println("too low ");
//             } else if (guess > randomNum) {
//                 System.out.println("too high");
//             } else {
//                 System.out.println("CORRECT ! the number was " + randomNum);
//             }
//
//         } while( guess != randomNum);
//         System.out.println("your number of attempts are: " + attempts);
//         System.out.println("You have won");
//         scanner.close();
//     }
// };z

// public class Hello {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int rows;
//         int columns;
//         char symbol;

//         System.out.print("Enter the number of rows: ");
//         rows = scanner.nextInt();

//         System.out.print("Enter the number of columns: ");
//         columns = scanner.nextInt();

//         System.out.print("Enter your symbol you want to use: ");
//         symbol = scanner.next().charAt(0);

//         for (int i = 0; i < rows  ; i++) {
//             for (int j = 0; j < columns  ; j++) {
//                 System.out.print(symbol);
//         }
//             System.out.println();
//         }
//         scanner.close();

//     }
// }

 method OR function
 public class Hello {
     public static void main(String[] args) {
        String name = "bro";
         happyBirthday(name);
         happyHirthday(name);
        double result = square(3);

         System.out.println(square(5));
         System.out.println(result);
         System.out.println(getFulName("aditya" , "sikarwarr"));

         int age = 21;
         if(ageCheck(age)) {
             System.out.println("you make sign up");
         } else {
             System.out.println("you must be 18 ");
         };
     };
     static void happyBirthday(String name) {
         System.out.println("happy birthday");
         System.out.println("happy birthday dear! " + name);
         System.out.println("happy birthday");
         System.out.println("happy birthday");
     };

     // also can be written in this way
     static void happyHirthday(String birthday) {
         System.out.println("happy birthday");
         System.out.println("happy birthday dear! " + birthday);
         System.out.println("happy birthday");
         System.out.println("happy birthday");

     };

     static double square(double number){
         return number * number;
     };

     static String getFulName (String first , String last) {
         return first + "" + last;
     };

     static boolean ageCheck(int age) {
         if (age >= 18) {
             return true;
         } else {
             return false;
         }
     };
};

 public class Hello {
     public static void main(String[] args) {
         String pizza = bake("flat bread");
         System.out.println(bake(pizza));
         System.out.println(add(1 , 2 ,2 ));
     };
     static double add(double a , double b){
         return a + b;
     };
     static double add(double a , double b, double c){
         return a + b + c;
     };
     static String bake(String bread){
         return bread + " pizza";
     };
 };

 