import java.util.Scanner;

// public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);

//     // getting employee details
//     System.out.print("enter your name : ");
//     String name = input.next();
//     input.next();
//     System.out.println("your name is : " + name);

//     System.out.print("Enter your id : ");
//     int id = input.nextInt();
//     System.out.println("your id is : " + id);

//     System.out.print("enter your age : ");
//     int age = input.nextInt();
//     System.out.println("your age is : " + age);

//     System.out.print("enter your salary : ");
//     float salary = input.nextFloat();
//     System.out.println("your salry is : " + salary);

//     System.out.println("Your name is " + name);
//     System.out.println("Your age is " + age);
//     System.out.println("Your salary is " + salary);
//     System.out.println("YOur id is : " + id);

//     input.close();

// }

public class New {
    public static void main(String[] args) {
        Scanner taking = new Scanner(System.in);
        System.out.print("enter your name");
        String name = taking.nextLine();

        System.err.println("Your name is " + name);

        taking.close();

    }
}