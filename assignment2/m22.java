
class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class m22 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            if (result == 0) {
                throw new CustomArithmeticException("Division by zero exception");
            }
        } catch (CustomArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
