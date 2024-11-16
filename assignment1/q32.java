public class q32 {
    int[] queue = new int[100];
    int front = 0, rear = -1;
    void enqueue(int x) { if (rear < 99) queue[++rear] = x; }
    int dequeue() { return front <= rear ? queue[front++] : -1; }
    public static void main(String[] args) {
        q32 q = new q32();
        q.enqueue(10); q.enqueue(20); System.out.println(q.dequeue()); System.out.println(q.dequeue());
    }
}
