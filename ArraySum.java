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



public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum of array elements = " + sum);
        System.err.println("");

        sc.close();
    }
}
