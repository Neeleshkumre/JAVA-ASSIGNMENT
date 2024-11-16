import java.util.Scanner;
public class q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), rev = 0, original = n;
        while (n != 0) { rev = rev * 10 + n % 10; n /= 10; }
        System.out.println(rev == original ? "Palindrome" : "Not Palindrome");
    }
}
