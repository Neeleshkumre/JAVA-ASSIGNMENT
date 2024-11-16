interface Interface1 { void method1(); void method2(); }
interface Interface2 { void method3(); void method4(); }
interface Interface3 { void method5(); void method6(); }
interface NewInterface extends Interface1, Interface2, Interface3 { void method7(); }

class ImplementClass implements NewInterface {
    public void method1() { System.out.println("Method 1"); }
    public void method2() { System.out.println("Method 2"); }
    public void method3() { System.out.println("Method 3"); }
    public void method4() { System.out.println("Method 4"); }
    public void method5() { System.out.println("Method 5"); }
    public void method6() { System.out.println("Method 6"); }
    public void method7() { System.out.println("Method 7"); }
}

public class m18 {
    public static void main(String[] args) {
        ImplementClass obj = new ImplementClass();
        obj.method1();
        obj.method7();
    }
}
