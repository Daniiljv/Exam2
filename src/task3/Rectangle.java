package task3;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calcSquare() {
        System.out.println("Square of the rectangle = " + length * width);
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Perimeter of rectangle = " + (length + width) * 2);
    }
}
