package practice.practiceAnimal;

public abstract class Animal {
    private String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    abstract void bark();
}