import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the exceeding speed limit (km/h): ");
        int exceedingSpeed = scanner.nextInt();

        String penalty;
        int demeritPoints;
        String licenseSuspension;

        if (exceedingSpeed < 10) {
            penalty = "$231";
            demeritPoints = 1;
            licenseSuspension = "None";
        } else if (exceedingSpeed >= 10 && exceedingSpeed < 25) {
            penalty = "$385";
            demeritPoints = 0;
            licenseSuspension = "None";
        } else if (exceedingSpeed >= 25 && exceedingSpeed < 29) {
            penalty = "$509";
            demeritPoints = 0;
            licenseSuspension = "3 months";
        } else if (exceedingSpeed >= 30 && exceedingSpeed < 34) {
            penalty = "$601";
            demeritPoints = 0;
            licenseSuspension = "3 months";
        } else if (exceedingSpeed >= 20 && exceedingSpeed < 25) {
            penalty = "$370";
            demeritPoints = 0;
            licenseSuspension = "3 months";

        } else if ( exceedingSpeed )

            System.out.println("Penalty: " + penalty);
            System.out.println("Demerit Points: " + demeritPoints);
            System.out.println("License Suspension: " + licenseSuspension);
        }
    }
}
