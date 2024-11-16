public class q29 {
    public static void main(String[] args) {
        int n = 4, num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print(num++ + " ");
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j++) System.out.print("  ");
            for (int j = i; j >= 1; j--) System.out.print(j + " ");
            for (int j = 2; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }
}
