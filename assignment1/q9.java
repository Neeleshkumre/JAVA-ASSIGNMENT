import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number to check
        System.out.print("Enter the number to be checked: ");
        int number = scanner.nextInt();

        // Input the divisor
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check divisibility
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
        } else if (number % divisor == 0) {
            System.out.println(number + " is divisible by " + divisor + ".");
        } else {
            System.out.println(number + " is not divisible by " + divisor + ".");
        }

        scanner.close();
    }
}
