class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

public class m25 {
    public static void main(String[] args) {
        String username = args[0];
        String password = args[1];
        try {
            if (username.length() < 6) throw new InvalidCredentialsException("Username must be at least 6 characters");
            if (!password.equals("password123")) throw new InvalidCredentialsException("Password does not match");
            System.out.println("Credentials are valid.");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }
}
