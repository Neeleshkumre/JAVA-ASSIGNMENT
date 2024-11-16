class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class m26 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        try {
            if (age < 0) throw new NegativeAgeException("Age cannot be negative");
            System.out.println("Age is valid.");
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
