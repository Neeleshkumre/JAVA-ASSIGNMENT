import java.util.Scanner;
public class m17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int sum = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            int num = Integer.parseInt(input.substring(i, i + 2));
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
