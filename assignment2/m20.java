public class m20 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Negative Array Index Exception Caught");
        }
        
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught");
        }
    }
}
