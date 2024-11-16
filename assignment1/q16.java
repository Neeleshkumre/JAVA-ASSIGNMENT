import java.util.Scanner;

public class q16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for each subject
        System.out.print("Enter marks in Mathematics: ");
        int mathMarks = scanner.nextInt();

        System.out.print("Enter marks in Physics: ");
        int physicsMarks = scanner.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistryMarks = scanner.nextInt();

        // Calculate total marks
        int totalMarks = mathMarks + physicsMarks + chemistryMarks;

        // Check if all conditions are satisfied
        if (mathMarks >= 60 && physicsMarks >= 50 && chemistryMarks >= 40 && totalMarks >= 200) {
            System.out.println("The student is eligible for admission.");
        } else {
            System.out.println("The student is not eligible for admission.");
        }

        scanner.close();
    }
}
