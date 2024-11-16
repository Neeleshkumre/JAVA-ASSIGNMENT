import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the start and end of the interval
        System.out.print("Enter the start of the interval: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the interval: ");
        int end = scanner.nextInt();

        System.out.println("Multiples of 10 between " + start + " and " + end + " are:");

        // Find and print multiples of 10 within the interval
        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
