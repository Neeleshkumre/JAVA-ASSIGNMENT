class Num {
    int number;
    Num(int number) { this.number = number; }
    void showNum() { System.out.println("Decimal: " + number); }
}
class HexNum extends Num {
    HexNum(int number) { super(number); }
    void showNum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}
public class NumDemo {
    public static void main(String[] args) {
        Num num = new Num(255);
        HexNum hexNum = new HexNum(255);
        num.showNum();
        hexNum.showNum();
    }
}
