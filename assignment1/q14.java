import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number to reverse
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        System.out.println("The reversed number is: " + reversedNumber);

        scanner.close();
    }
}
