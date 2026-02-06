import java.util.*;

// class New {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int[] arr = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 0, };
//         String text = "Hello World" ;
//         for (int i = 0; i < arr.length; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(arr[i]);
//             }
//         }
//     }
// }

class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] str = text.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (!(str[i] >= 48 && str[i] <= 57)) {
                System.out.println(str[i]);
            }
        }
    }
}
