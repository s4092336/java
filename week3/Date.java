package week3;

public class Date {
    public static void main(String[] args) {
        // declare 3 memory boxes (variables)
        int day, month, year;

        // get input from user
        System.out.print("Enter day: ");
        day = Integer.parseInt(System.console().readLine());

        System.out.print("Enter month: ");
        month = Integer.parseInt(System.console().readLine());

        System.out.print("Enter year: ");
        year = Integer.parseInt(System.console().readLine());

        // print date in different formats
        System.out.println("European format: " + day + "/" + month + "/" + year);
        System.out.println("American format: " + month + "/" + day + "/" + year);
        System.out.println("Japanese format: " + year + "/" + month + "/" + day);
    }
}

// Input: asks user to input (string day, Integer month, Integer year)

// process: Declare strings: day, month
// Declare integers: year, date
// Get input from user and assign values

// Output: Display date in format: day/month/year (European format)
// month/day/year (American format)
// year/month/day (Japane