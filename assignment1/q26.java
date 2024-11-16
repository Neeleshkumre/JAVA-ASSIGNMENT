import java.util.Scanner;
public class q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = 2, flag = 0;
        while (i <= Math.sqrt(n)) { if (n % i == 0) { flag = 1; break; } i++; }
        System.out.println(n > 1 && flag == 0 ? "Prime" : "Not Prime");
    }
}
