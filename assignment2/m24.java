class TooOlder extends Exception { }
class TooYounger extends Exception { }

public class m24 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        String name = args[1];
        try {
            if (age > 45) throw new TooOlder();
            else if (age < 20) throw new TooYounger();
            else {
                System.out.println(name + " is eligible.");
            }
        } catch (TooOlder e) {
            System.out.println("Age is too high for eligibility.");
        } catch (TooYounger e) {
            System.out.println("Age is too low for eligibility.");
        }
    }
}
