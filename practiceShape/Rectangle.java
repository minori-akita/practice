package practice.practiceShape;

// 子クラス
class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
        this.calculateArea();
    }
    
    @Override
    public void calculateArea() {
        area = length * width;
    }

    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}