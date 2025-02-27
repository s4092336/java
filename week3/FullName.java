package week3;

import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get first name from user
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Get last name from user
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // add both first name and last name to create full name
        String fullName = firstName + " " + lastName;

        // Print the full name
        System.out.println("Hello, my name is " + fullName + ".");

        scanner.close();
    }
}
