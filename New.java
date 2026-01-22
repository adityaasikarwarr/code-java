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

        Scanner sc = new Scanner(System.in);

        // Step 1: Take array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Step 2: Take array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Print array
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
