class ThisExample {
    int a;
    ThisExample(int a) { this.a = a; }
    void display() { System.out.println("Value: " + this.a); }
    public static void main(String[] args) {
        ThisExample obj = new ThisExample(10);
        obj.display();
    }
}