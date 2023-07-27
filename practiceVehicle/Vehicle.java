package practice.practiceVehicle;

public class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void drive() {
        System.out.println("Driving the " + brand);
    }
}
