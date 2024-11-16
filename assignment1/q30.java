import java.util.Scanner;
public class q30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) sum += (arr[i] = sc.nextInt());
        System.out.println("Sum: " + sum + " Average: " + (sum / (double) n));
    }
}
