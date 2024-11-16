public class q11{
    public static void main(String[] args) {
        int number = 12; // Number to calculate factorial of
        long factorial = 1; // Using long to handle large values

        // Calculate factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
