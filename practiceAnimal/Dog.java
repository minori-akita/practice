package practice.practiceAnimal;

public class Dog extends Animal {
    String brand;

    public Dog(String name, int age, String brand) {
        super(name, age);
        this.brand = brand;
        // TODO Auto-generated constructor stub
    }

    void bark() {
        System.out.println("wow");
    }
}
