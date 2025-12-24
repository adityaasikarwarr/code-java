import java.util.Scanner;
// public class Main  {
// public static void  main(String args[]) {
// System.out.println("hello world");
// }
// }

// public class Main {
//     public static void main(String args[]) {
//         int a = 30;
//         if (a >= 10) {
//             if (a < 20) {
//                 System.out.println("hello world");
//             } else {
//                 System.out.println("hello universe");
//             }
//         } else if ( a >= 20) {
//             System.out.println("hello galaxy");
//         }
//           switch (a) {
//               int a = 3;
//                    case 1:
//                        System.out.println("hello world");123

//                   break;
//                   case 2:
//                   System.out.println("hello universe");
//                   break;
//               case 3:
//                   System.out.println("hello galaxy");
//                   break;
//               case 4:
//                   System.out.println("hello multiverse");
//                   break;
//               default:
//                   System.out.println("invalid input");
//           }

//         for (int  i = 0 ; i < 10 ; i++){
//             System.out.println(i);
//       };

// public class Main {
//   public static void main(String[] args){
//       String name = "aditya sikarwarr";
//       int gta = 6;
//       double pi =  3.14159;
//       char gender = 'M';
//       boolean isAdmin = true;

//    if(isAdmin) {
//        System.out.println("hello  " + name  +  gta +   pi  + gender  ) ;
//    }
//   }
// };
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("enter your name: ");
//         String name = scanner.nextLine();
//         System.out.println("hello " + name);

//         System.out.print("Enter your age: ");
//         int age = scanner.nextInt();
//         System.out.println("your age is : " + age);

//         System.out.print("what is your gpa: ");
//         double gpa = scanner.nextDouble();
//         System.out.print("your gpa is: " + gpa);

//         System.out.println("hello " + name);
//         System.out.println("yu are " + age + " years old");
//         System.out.println("your gpa is: " + gpa);
//         double width = 0;
//         double length = 0;
//         double area =  0;

//         System.out.println("calculate the area of rectangle");

//         System.out.print("input the breadth: ");
//         width = scanner.nextDouble();
//         System.out.println(width);

//         System.out.print("enter your length: ");
//         length = scanner.nextDouble();
//         System.out.println(length);

//         System.out.println("length and breadth are : " + width + "" +  length
//         );
//         area = width * length;
//         System.out.println("area = " + area + "cm");
//         scanner.close();
//     }
// };
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String adjective1;
//         String noun1;
//         String adjective2;
//         String verb1;
//         String adjective3;

//         System.out.print("enter an adjective: ");
//         adjective1 = scanner.nextLine();

//         System.out.print("enter a adjective: ");
//         adjective2 = scanner.nextLine();

//         System.out.print("enter an  adjective: ");
//         adjective3 = scanner.nextLine();

//         System.out.print("enter a noun: ");
//         noun1 = scanner.nextLine();

//         System.out.print("enter a verb with -ing (action): ");
//         verb1 = scanner.nextLine();

//         System.out.println("\n today i went a " + adjective1 + " zoo");
//         System.out.println("in an exhibit , i saw a " + noun1 + ".");
//         System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
//         System.out.println("I was " + adjective3 + "!");
//     }
// };

// shopping cart program
// import java.util.Scanner;
// public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//        String item;
//        double price;
//        int quantity;
//        char currency = '$';
//        double total;
//        System.out.print("what item would you like to have ?");
//        item = scanner.nextLine();

//        System.out.print("what is the price for each  ? ");
//        price = scanner.nextDouble();

//        System.out.print("whats the quantity you want ?");
//        quantity = scanner.nextInt();

//        total = price * quantity;

//        System.out.println("\nyou have bought " + quantity + " " + item);
//        System.out.println("your total is " + currency + total);

//        scanner.close();
//    };
// }

// import java.util.Scanner;
// import java.util.Random;

// public class Main {
//    public static void main(String[] args){

//     Scanner scanner = new  Scanner(System.in);
//     Random random = new Random();

//     int number ;
//     number = random.nextInt(1 ,9);
//     System.out.println(number);

//     boolean isHead ;
//     isHead =  random.nextBoolean();
//     if(isHead) {
//         System.out.println("Heads");
//     } else {
//         System.out.println("tails");
//     }

//    };
// };

// import java.util.Scanner;
// public class Main {
//    public static void main(String[] args){
//    Scanner scanner = new Scanner(System.in);

//     calculate the hypotenuse
//        double a;
//        double b;
//        double c;

//        System.out.print("enter the length os side A : ");
//        a =  scanner.nextDouble();

//        System.out.print("enter the length of side B : ");
//        b = scanner.nextDouble();

//        c = Math.sqrt(Math.pow(a , 2) + Math.pow(b  , 2));

//        System.out.print("The hypotenuse of side c is : " + c + "cm");

//      calculate the circumference , area and the volume.
//          double radius ;
//          double circumference;
//          double area;
//          double volume;

//          System.out.print("enter the length of radius of the circle : ");
//          radius = scanner.nextDouble();

//          circumference = 2 * Math.PI * radius;
//          area = Math.PI * Math.pow(radius , 2);
//          volume = (4.0 / 3.0) * Math.PI * Math.pow(radius , 3);

//          System.out.println("The circumference is : " + circumference);
//          System.out.println("The area is : " + area);
//          System.out.println("The volume is : " + volume);

//   scanner.close();
//    };
// };

// public class Main{
//    public static void main(String[] args) {
//        String name = "aditya ";    //%S
//        char firstLetter = 'a';     //%c
//        int age = 30;               //%d
//        double height = 67.3;       //%f
//        boolean isEmployed = true;  //%b

//        System.out.printf("hello %s\n", name );
//        System.out.printf("your name starts with %c\n", firstLetter);
//        System.out.printf("your age is %d \n", age);
//        System.out.printf("your height is %f \n", height);
//        System.out.printf("employed %b \n", isEmployed);
//        System.out.printf("%s is %d years old\n", name , age);

//        double prince1 = 9.99;
//        double prince2 = 756.76;
//        double prince3 = 87.99;

//        System.out.printf("%.1f\n", prince1);  //.1 is the precision added to the out to display up to the number given decimal places
//        System.out.printf("%.2f\n", prince2);
//        System.out.printf("%+.1f\n", prince3);

//         + = output a plus
//         , = comma grouping separator
//         ( = negative numbers are enclosed in ()
//         space = display a minus  if negative , space if positive
//          0 = zero padding
//         number =  right justified padding
//         negative number = left justified padding

//        int id1 = 1;
//        int id2 = 14;
//        int id3 = 145;
//        int id4 = 1456;

//        System.out.printf("%04d\n" , id1);
//        System.out.printf("%05d\n" , id2);
//        System.out.printf("%6d\n" , id3);
//        System.out.printf(java
//                "%7d\n" , id4);
// }
// };

//   code to calculate compound interest.
// import java.util.Scanner;
// public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double principal;
//        double rate;
//        int timesCompound;
//        int year;
//        double amount;

//        System.out.print("Enter the principal amount: ");
//        principal = scanner.nextDouble();

//        System.out.print("Enter the interest rate: ");
//        rate = scanner.nextDouble() / 100;

//        System.out.print("enter the # of times    compound per year: ");
//        timesCompound = scanner.nextInt();

//        System.out.print("Enter the # of years: ");
//        year = scanner.nextInt();

//        amount = principal * Math.pow(1 + rate / timesCompound, timesCompound * year);

//        System.out.printf("The amount after %d is %f ", year , amount);

//        scanner.close();
//    };
// };

// public class Main{
//    public static void main(String[] args) {
//       String name = "aditya";
//       int length = name.length();
//       char letter = name.charAt(0);
//       int index = name.indexOf("l");
//       int lastIndex = name.lastIndexOf("o");

//       name = name.toLowerCase();
//       name = name.toUpperCase();
//       name = name.trim();
//       name = name.replace("0" , "a");

//    if (name.isEmpty()) {
//        System.out.println("your name is empty");
//    } else {
//        System.out.println("your name is : " + name);
//    };

//        if (name.contains(" "))
//        {
//            System.out.println("your name contain spaces");

//        } else {
//            System.out.println("your name do not has space"); };
//     if (name.equals("aditya"))
//        {
//            System.out.println("your name is correct");

//        } else {
//            System.out.println("your name is not correct"); };
//    };
//  };chNGES
// import java.util.Scanner;

// public class Main {
//    public static void main(String[] args) {
       //.substring() = a method used to extract a portion of a string
       // String.substring(start ,  end)
//     Scanner  scanner = new Scanner(System.in);

//        String email;
//        String username;
//        String domain;

//        System.out.print("enter your email");
//        email = scanner.nextLine();

//        if (email.contains("@")) {
//            username = email.substring(0 ,email.indexOf("@") );
//            domain = email.substring(email.indexOf("@") + 1);
//            System.out.println(username);
//            System.out.println(domain);
//        } else {
//            System.out.println("emails must contain  @");
//        };
//       scanner.close();

//    }
// }

// convert weights
// import java.util.Scanner;
// public class Main{
//    public  static void main(String[] args){
//       Scanner scanner = new Scanner(System.in);

//       double weight;
//       double newWeight;
//       int choice;

//        System.out.println("Weight Conversion program");
//        System.out.println("1: Convert lbs to kgs");
//        System.out.println("2: Convert kgs to lbs");

//        System.out.print("Choose an option : ");
//        choice = scanner.nextInt();

//        if(choice == 1){
//            System.out.print("Enter the weight in lbs: ");
//            weight = scanner.nextDouble();
//            newWeight = weight * 0.453592;
//            System.out.println("THe new weight in kgs is : " +  newWeight);
//        } else if (choice == 2) {
//            System.out.print("Enter the weight in kgs : ");
//            weight = scanner.nextDouble();
//            newWeight = weight * 0.453592;
//            System.out.printf("The new  weight in lbs is : %.4f", newWeight);
//        } else {
//            System.out.println("not a valid choice");
//        }

//    };
// };

// temperature convertor

// import java.util.Scanner;

// public class Main {
//    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        double temp;
//        double newTemp;
//        String unit;

//        System.out.print("Enter the temperature: ");
//        temp = scanner.nextDouble();

//        System.out.print("Convert to Celsius or  Fahrenheit? (C OR F )");
//        unit = scanner.next().toUpperCase();

//        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 5/9) + 32;

//        System.out.printf("%.3f %s", newTemp , unit);

//        scanner.close();
//    };
// };
//import java.util.Scanner;
//public class Main{
//
//public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String day ;
//         System.out.print("enter the day of thw week: ");
//         day = scanner.nextLine();
//        switch (day) {

//            case "monday" -> System.out.println("It is monday");
//            case "tuesday" -> System.out.println("it is a weekday");
//            case "wednesday" -> System.out.println("it is a weekday");
//            case "thursday" -> System.out.println("it is a weekday");
//            case "friday" -> System.out.println("it is a weekday");
//            case "saturday" -> System.out.println("it is a weekend");
//            case "sunday" -> System.out.println("it is a weekend");
//            default -> System.out.println(day + "it is not a day");

//            case "monday" , "tuesday" ,"wednesday" , "thursday" , "friday" ->
//                    System.out.println("it is a weekday");
//            case "saturday" , "sunday" ->
//                    System.out.println("it is a weekend");
//            default -> System.out.println(day + "it is not a day");
//        };
//}}

// calculator 
//public  class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double num1;
//        double num2;
//        char operator;
//        double result = 0;
//        boolean validOperation = true;
//
//        System.out.print("Enter the first number: ");
//        num1 = scanner.nextDouble();
//
//        System.out.print("Enter an operator (+ , - , *, /, ^): ");
//        operator = scanner.next().charAt(0);
//
//        System.out.print("Enter the second number: ");
//        num2 = scanner.nextDouble();

//        switch (operator) {
//            case '+' -> result = num1 + num2;
//            case '-' -> result = num1 - num2;
//            case '*' -> result = num1 * num2;
//            case '/' -> {
//                if(num2 == 0) {
//                    System.out.println("can not be determined");
//                    validOperation = false;
//                } else {
//                    result = num1 / num2;
//                };
//            }
//            case '^' -> result = Math.pow(num1, num2);
//            default -> {
//                System.out.println("invalid operator");
//                 validOperation = false;
//            }
//        }
//      if (validOperation) {
//          System.out.println(result);
//      }
//    }
//};