import java.util.Scanner;
public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), hcf = a, temp = b;
        while (temp != 0) { int t = temp; temp = hcf % temp; hcf = t; }
        System.out.println((a * b) / hcf);
    }
}
