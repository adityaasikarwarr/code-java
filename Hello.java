
import java.util.Scanner;

public class Hello {
 
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        System.err.println("hello world");
        int num1 = scanner.nextInt();

        System.err.println(num1);

        scanner.close();
    }
}
