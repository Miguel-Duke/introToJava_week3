import java.util.Scanner;

public class InAJiffy {

    /* Define your method here */

    public static double secondsToJiffies(double userSeconds){
        return (userSeconds * 100);
    }

    public static void main(String[] args) {
        /* Type your code here. */

        Scanner scan = new Scanner(System.in);

        InAJiffy jif = new InAJiffy();

        double userSeconds;
        double jiffies;

        userSeconds = scan.nextDouble();

        jiffies =  jif.secondsToJiffies(userSeconds);

        System.out.printf("%.2f", jiffies);
    }
}
