import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Initialize the first two terms of the Fibonacci series
        long first = 0, second = 1;

        System.out.println("Fibonacci series up to " + n + " terms:");

        // Loop to generate and print the Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Update the values of first and second
            long nextTerm = first + second;
            first = second;
            second = nextTerm;
        }

        scanner.close();
    }
}
