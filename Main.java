// // public class Main  {
// // public static void  main(String args[]) {
// // System.out.println("hello world");
// // }
// // }

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
//         //   int a = 3;
//         //   switch (a) {
//         //       case 1:
//         //           System.out.println("hello world");
//         //           break;
//         //       case 2:
//         //           System.out.println("hello universe");
//         //           break;
//         //       case 3:
//         //           System.out.println("hello galaxy");
//         //           break;
//         //       case 4:
//         //           System.out.println("hello multiverse");
//         //           break;
//         //       default:
//         //           System.out.println("invalid input");
//         //   }



//         for (int  i = 0 ; i < 10 ; i++){
//             System.out.println(i);
//       };

//public class Main {
//   public static void main(String[] args){
//       String name = "aditya sikarwarr";
//       int gta = 6;
//       double pi =  3.14159;
//       char gender = 'M';
//       boolean isAdmin = true;
//
//    if(isAdmin) {
//        System.out.println("hello  " + name  +  gta +   pi  + gender  ) ;
//    }
//   }
//};
import java.util.Scanner;

 public class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

//         System.out.print("enter your name: ");
//         String name = scanner.nextLine();
//         System.out.println("hello " + name);
//
//         System.out.print("Enter your age: ");
//         int age = scanner.nextInt();
//         System.out.println("your age is : " + age);
//
//         System.out.print("what is your gpa: ");
//         double gpa = scanner.nextDouble();
//         System.out.print("your gpa is: " + gpa);
//
//         System.out.println("hello " + name);
//         System.out.println("yu are " + age + " years old");
//         System.out.println("your gpa is: " + gpa);
         double width = 0;
         double length = 0;
         double area =  0;

         System.out.println("calculate the area of rectangle");

         System.out.print("input the breadth: ");
         width = scanner.nextDouble();
//         System.out.println(width);

         System.out.print("enter your length: ");
         length = scanner.nextDouble();
//         System.out.println(length);

//         System.out.println("length and breadth are : " + width + "" +  length
//         );

         area = width * length;
         System.out.println("area = " + area + "cm");



         scanner.close();

     }
}