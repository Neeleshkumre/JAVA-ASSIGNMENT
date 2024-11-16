import java.util.Scanner;
public class q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
        int bin = sc.nextInt();
        System.out.println(Integer.parseInt(String.valueOf(bin), 2));
    }
}
