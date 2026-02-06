import java.util.*;

class New {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(i * i + " ");
            sum = sum + (i * i);
            System.out.println(sum);
        }
        scan.close();
    }
}