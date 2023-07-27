package practice.practiceVehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        car.drive();  // 親クラスのメソッドを呼び出し
        car.honk();  // 子クラスのメソッドを呼び出し

        Motorcycle motorcycle = new Motorcycle("Honda", true);
        motorcycle.drive();  // 親クラスのメソッドを呼び出し
        motorcycle.wheelie();  // 子クラスのメソッドを呼び出し
    }
}
