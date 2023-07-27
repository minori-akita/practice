package practice.practiceShape;

// 親クラス
public class Shape {
    protected double area;
    protected String color;

    public double getArea() {
        return area;
    }

    public Shape(double area, String color) {
        this.area = area;
        this.color = color;
    }

    public Shape(String color) {
        // this.calculateArea();
        this.color = color;
    }

    public void calculateArea() {
        System.out.println("Calculating area of the shape...");
    }

    public void draw() {
        System.out.println("Drawing a shape");
    }
}



