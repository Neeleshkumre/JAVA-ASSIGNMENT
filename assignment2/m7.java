class m7 {
    void display() { System.out.println("Parent Method"); }
}
class Child extends m7 {
    void display() { System.out.println("Child Method"); }
    public static void main(String[] args) {
        m7 obj = new Child();
        obj.display();
    }
}
