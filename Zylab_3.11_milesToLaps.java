import java.util.Scanner;

public class MilesToLaps {

    /* Define your method here */

    private double numMiles;

    public static double milesToLaps(double userMiles) {
        return (userMiles * 4);
    }

    public static void main(String[] args) {
        /* Type your code here. Your code must call the method.  */

        MilesToLaps userLaps = new MilesToLaps();

        Scanner scnr = new Scanner(System.in);

        double userMiles;
        double numLaps;

        userMiles = scnr.nextDouble();

        numLaps = userLaps.milesToLaps(userMiles);

        System.out.printf("%.2f", numLaps);
    }
}
