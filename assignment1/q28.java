import java.util.Scanner;
import java.util.Arrays;
public class q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(n % 2 == 0 ? (arr[n / 2 - 1] + arr[n / 2]) / 2.0 : arr[n / 2]);
    }
}
