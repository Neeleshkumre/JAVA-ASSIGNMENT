class Parent {
    static void show() { System.out.println("Parent Static Method"); }
}
class Child extends Parent {
    static void show() { System.out.println("Child Static Method"); }
    public static void main(String[] args) {
        Parent.show();
        Child.show();
    }
}
