// // import java.util.Scanner;

// public class q5 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the first number: ");
//         double num1 = scanner.nextDouble();

//         System.out.print("Enter the second number: ");
//         double num2 = scanner.nextDouble();

//         System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

//         // Swapping without using a temporary variable
//         num1 = num1 + num2;
//         num2 = num1 - num2;
//         num1 = num1 - num2;

//         System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

//         scanner.close();
//     }
// }
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swapping using a temporary variable
        double temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        scanner.close();
    }
}
