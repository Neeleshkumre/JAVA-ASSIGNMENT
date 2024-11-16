import java.util.Scanner;
public class q31 {
    int[] stack = new int[100];
    int top = -1;
    void push(int x) { if (top < 99) stack[++top] = x; }
    int pop() { return top >= 0 ? stack[top--] : -1; }
    public static void main(String[] args) {
        q31 s = new q31();
        s.push(10); s.push(20); System.out.println(s.pop()); System.out.println(s.pop());
    }
}
