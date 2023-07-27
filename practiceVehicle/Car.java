package practice.practiceVehicle;

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    public void honk() {
        System.out.println("Honking the horn of " + brand);
    }
}
