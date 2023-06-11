package practice.practiceAnimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello,World");

        Cat cat1 = new Cat("tama", 3);
        cat1.bark();
        System.out.println(cat1.getName());
        System.out.println(cat1.age);


        Dog dog1 = new Dog("pochi", 5, "shiba");
        dog1.bark();
        System.out.println(dog1.getName());
        System.out.println(dog1.age);
        System.out.println(dog1.brand);

        Bird bird1 = new Bird("pichan", 29);
        bird1.bark();
        System.out.println(bird1.getName());
        System.out.println(bird1.age);
    }
}
