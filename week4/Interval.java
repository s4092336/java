package week4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower limit of interval (integer): ");
        int lowerLimit = scanner.nextInt();

        System.out.print("Enter the upper limit of interval (integer): ");
        int upperLimit = scanner.nextInt();

        System.out.print("Enter a value to check: ");
        int value = scanner.nextInt();

        if (value > lowerLimit && value < upperLimit) {
            System.out.println(
                    "The value " + value + " lies within the interval (" + lowerLimit + ", " + upperLimit + ")");
        } else {
            System.out.println(
                    "The value " + value + " is outside the interval (" + lowerLimit + ", " + upperLimit + ")");
        }
    }
}
