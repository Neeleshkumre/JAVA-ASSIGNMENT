import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conversion factor: 1 mile = 1.60934 kilometers
        final double MILES_TO_KILOMETERS = 1.60934;

        System.out.print("Enter the distance in miles: ");
        double miles = scanner.nextDouble();

        // Convert miles to kilometers
        double kilometers = miles * MILES_TO_KILOMETERS;

        System.out.printf("%.2f miles is equal to %.2f kilometers.%n", miles, kilometers);

        scanner.close();
    }
}
