package practice.practiceShape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 3.0);
        System.out.println("Area of the circle: " + circle.getArea());

        Rectangle rectangle = new Rectangle("blue", 4.0, 6.0);
        System.out.println("Area of the rectangle: " + rectangle.getArea());
        rectangle.draw();
    }
}