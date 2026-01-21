    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        getting employee details
        System.out.print("enter your name : ");
        String name = input.next();
        input.next();
        System.out.println("your name is : " + name);

        System.out.print("Enter your id : ");
        int id = input.nextInt();
        System.out.println("your id is : " + id);

        System.out.print("enter your age : ");
        int age = input.nextInt();
        System.out.println("your age is : " + age);

        System.out.print("enter your salary : ");
        float salary = input.nextFloat();
        System.out.println("your salry is : " + salary);

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your salary is " + salary);
        System.out.println("YOur id is : " + id);

        input.close();

    }
public class New {
    public static void main(String[] args) {
        int[] numbers = {2 , 4 ,5 ,3 ,4 ,3 ,4 ,3};
        int sum = 0;
        Double average;

        for (int number : numbers){
            sum += number;
        }

        int arrayLength = numbers.length;

        average = ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }
}