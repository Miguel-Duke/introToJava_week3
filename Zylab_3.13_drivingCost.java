import java.util.Scanner;

public class DrivingCostsMethod {

    /* Define your method here */

    public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon){
        return ( (drivenMiles / milesPerGallon) * dollarsPerGallon );
    }

    public static void main(String[] args) {
        /* Type your code here. */

        DrivingCostsMethod driveCalc = new DrivingCostsMethod();
        Scanner scan = new Scanner(System.in);

        double drivenMiles;
        double milesPerGallon;
        double dollarsPerGallon;
        double costToDrive;

        milesPerGallon = scan.nextDouble();
        dollarsPerGallon = scan.nextDouble();

        costToDrive = driveCalc.drivingCost(10.0, milesPerGallon, dollarsPerGallon);
        System.out.printf("%.2f", costToDrive);

        costToDrive = driveCalc.drivingCost(50.0, milesPerGallon, dollarsPerGallon);
        System.out.printf(" " + "%.2f", costToDrive);

        costToDrive = driveCalc.drivingCost(400.0, milesPerGallon, dollarsPerGallon);
        System.out.printf(" " + "%.2f", costToDrive);
        System.out.println("");
    }
}
