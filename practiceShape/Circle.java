package practice.practiceShape;

// 子クラス
class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        this.calculateArea();
    }
    
    @Override
    public void calculateArea() {
        this.area = Math.PI * radius * radius;
    }
}