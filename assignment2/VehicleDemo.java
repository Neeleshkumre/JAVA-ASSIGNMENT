class Vehicle {
    protected String regnNumber, color, ownerName;
    protected int speed;
    void showData() { System.out.println("This is a vehicle class."); }
}
class Bus extends Vehicle {
    private int routeNumber;
    Bus(String regnNumber, int speed, String color, String ownerName, int routeNumber) {
        this.regnNumber = regnNumber; this.speed = speed; this.color = color; this.ownerName = ownerName;
        this.routeNumber = routeNumber;
    }
    void showData() {
        super.showData();
        System.out.println("Route: " + routeNumber + ", Regn: " + regnNumber + ", Speed: " + speed +
                ", Color: " + color + ", Owner: " + ownerName);
    }
}
class Car extends Vehicle {
    private String manufacturerName;
    Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        this.regnNumber = regnNumber; this.speed = speed; this.color = color; this.ownerName = ownerName;
        this.manufacturerName = manufacturerName;
    }
    void showData() {
        super.showData();
        System.out.println("Manufacturer: " + manufacturerName + ", Regn: " + regnNumber +
                ", Speed: " + speed + ", Color: " + color + ", Owner: " + ownerName);
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        Bus bus = new Bus("KA01", 50, "Red", "John", 10);
        Car car = new Car("KA02", 100, "Blue", "Alice", "Toyota");
        bus.showData();
        car.showData();
    }
}
