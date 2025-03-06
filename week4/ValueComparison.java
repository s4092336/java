import java.util.Scanner;

public class ValueComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first number (value1): ");
            int value1 = scanner.nextInt();

            System.out.print("Enter the second number (value2): ");
            int value2 = scanner.nextInt();

            if (value1 > value2) {
                System.out.println("The greater number is: " + value1);
            } else if (value2 > value1) {
                System.out.println("The greater number is: " + value2);
            } else {
                System.out.println("Both numbers are equal.");
            }
        } finally {
            scanner.close();
        }
    }
}