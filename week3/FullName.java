package week3;

import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        String fullName = firstName + " " + lastName;

        System.out.println("Hello, my name is " + fullName + ".");

        scanner.close();
    }
}
