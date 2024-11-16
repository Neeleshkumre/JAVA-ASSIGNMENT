class TooHot extends Exception { }
class TooCold extends Exception { }

public class m23 {
    public static void main(String[] args) {
        double temp = Double.parseDouble(args[0]);
        try {
            if (temp > 35) throw new TooHot();
            else if (temp < 5) throw new TooCold();
            else {
                System.out.println("Normal temperature: " + temp);
                System.out.println("In Fahrenheit: " + (temp * 9/5 + 32));
            }
        } catch (TooHot e) {
            System.out.println("Too Hot!");
        } catch (TooCold e) {
            System.out.println("Too Cold!");
        }
    }
}
