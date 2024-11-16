import java.util.Scanner;
public class q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), min = Integer.MAX_VALUE;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) min = Math.min(min, (arr[i] = sc.nextInt()));
        System.out.println(min);
    }
}
