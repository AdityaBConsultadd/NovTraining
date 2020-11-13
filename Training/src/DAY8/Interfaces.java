package DAY8;

interface Vehicle{
    void service();
    void drive();
}

public class Interfaces implements Vehicle{
    public static void main(String[] args) {
        Vehicle vehicle = new Interfaces();
        vehicle.drive();
        vehicle.service();
    }

    @Override
    public void service() {
        System.out.println("Time for service");
    }

    @Override
    public void drive() {
        System.out.println("Driving is fun");
    }
}
class Test implements Vehicle{

    @Override
    public void service() {
        System.out.println("lkasfn");
    }

    @Override
    public void drive() {
        System.out.println("nsdkfln");
    }
}
