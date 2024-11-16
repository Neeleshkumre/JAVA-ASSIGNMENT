import java.util.Scanner;
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class m21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();
        try {
            if (country.equalsIgnoreCase("India"))
                System.out.println("Capital: New Delhi");
            else
                throw new NoMatchFoundException("No match found for " + country);
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
