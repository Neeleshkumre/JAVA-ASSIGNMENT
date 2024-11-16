class m6 {
    void print(int x) { System.out.println("Integer: " + x); }
    void print(String s) { System.out.println("String: " + s); }
    public static void main(String[] args) {
        m6 obj = new m6();
        obj.print(10);
        obj.print("Hello");
    }
}
