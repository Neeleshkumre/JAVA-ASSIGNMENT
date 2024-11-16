class Distance {
    double distance;
    Distance(double distance) { this.distance = distance; }
    void travelTime() { System.out.println("Time in hours: " + (distance / 60)); }
}
class DistanceMKS extends Distance {
    DistanceMKS(double distance) { super(distance); }
    void travelTime() { System.out.println("Time in hours: " + (distance / 100)); }
}
public class DistanceDemo {
    public static void main(String[] args) {
        Distance d1 = new Distance(120);
        DistanceMKS d2 = new DistanceMKS(120);
        d1.travelTime();
        d2.travelTime();
    }
}
