class q4{
    q4() { System.out.println("Zero-Argument Constructor"); }
    q4(int x) { System.out.println("Value: " + x); }
    public static void main(String[] args) {
        new q4();
        new q4(10);
    }
}
