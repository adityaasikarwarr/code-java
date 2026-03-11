import java.util.Scanner;

public class ContactManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        String[] phones = new String[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== CONTACT MANAGEMENT =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 1) {
                if (count >= 10) {
                    System.out.println("Contact list is full!");
                } else {
                    System.out.print("Enter Name: ");
                    names[count] = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    phones[count] = sc.nextLine();

                    count++;
                    System.out.println("Contact added successfully!");
                }
            }

            else if (choice == 2) {
                if (count == 0) {
                    System.out.println("No contacts found.");
                } else {
                    System.out.println("\n===== CONTACT LIST =====");
                    for (int i = 0; i < count; i++) {
                        System.out.println("Name  : " + names[i]);
                        System.out.println("Phone : " + phones[i]);
                        System.out.println("----------------------");
                    }   
                }
            }

            else if (choice == 3) {
                System.out.println("Exiting program...");
            }

            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}