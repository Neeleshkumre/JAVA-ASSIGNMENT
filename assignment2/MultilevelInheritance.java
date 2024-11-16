class A { void display() { System.out.println("Class A"); } }
class B extends A { void display() { System.out.println("Class B"); } }
class C extends B { void display() { System.out.println("Class C"); } }
public class MultilevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}
