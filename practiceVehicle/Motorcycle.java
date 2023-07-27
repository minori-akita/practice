package practice.practiceVehicle;

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, boolean hasSidecar) {
        super(brand);
        this.hasSidecar = hasSidecar;
    }

    public void wheelie() {
        System.out.println("Performing a wheelie on " + brand);
    }
}
