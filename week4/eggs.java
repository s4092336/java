package week4;

import java.util.Scanner;

public class eggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight of the egg in grams: ");
        double eggWeight = scanner.nextDouble();

        String eggSize;

        if (eggWeight > 72) {
            eggSize = "King-Size";
        } else if (eggWeight >= 68 && eggWeight <= 72) {
            eggSize = "Jumbo";
        } else if (eggWeight >= 60 && eggWeight <= 67) {
            eggSize = "Extra-Large";
        } else if (eggWeight >= 52 && eggWeight <= 59) {
            eggSize = "Large";
        } else if (eggWeight >= 43 && eggWeight <= 51) {
            eggSize = "Medium";
        } else {
            eggSize = "Too Small";
        }

        System.out.println("The size of the egg is: " + eggSize);
    }
}
