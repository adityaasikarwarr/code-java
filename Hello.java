 number guessing game
 public class Hello {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNum = random.nextInt(1 ,11);
        System.out.println("NUmber guessing game");
        System.out.println("Guess the number between 1-10: ");

        do{
            System.out.print("enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNum) {
                System.out.println("too low ");
            } else if (guess > randomNum) {
                System.out.println("too high");
            } else {
                System.out.println("CORRECT ! the number was " + randomNum);
            }

        } while( guess != randomNum);
        System.out.println("your number of attempts are: " + attempts);
        System.out.println("You have won");
        scanner.close();
    }
};z

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter your symbol you want to use: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows  ; i++) {
            for (int j = 0; j < columns  ; j++) {
                System.out.print(symbol);
        }
            System.out.println();
        }
        scanner.close();

    }
}

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

 variable scope
 public class Hello {
        static int x = 4; //class variable
     public static void main(String[] args) {
         int x = 2; // local variable
         System.out.println(x);
         doSomething();
     };
     static void doSomething(){
//         int x = 2; // local variable
         System.out.println(x);
     };/
 };

array
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] foods ;

        int size;

        System.out.print("Enter the size of array you want: ");
        size = scanner.nextInt();
        scanner.nextLine();
        foods = new String[size];

        for (int i =0; i < foods.length ; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        };

        for(String food : foods) {
            System.out.println(food);
        };
    }
}

variable arguments or varargs
allow a method to accept a varying numbers of arguments make methods more flexible , no need for overloading methods java will pack the arguments into an array (... ellipses)
public class Hello {
   public static void main(String[] args) {

       System.out.println(add(1,23,4));
       System.out.println(average(1,2,3,4,5,6,7,8));

   };

   static int add(int... numbers){
       int sum = 0;
       for(int number : numbers){
           sum += number;
       };

     return sum;
   };

   static double average(double... numbers){

       double sum = 0;

       if(numbers.length == 0){
           return 0;
       };

       for (double number : numbers){
           sum += number;
       }; // enhanced for loop

       return sum / numbers.length;
   };
};


 