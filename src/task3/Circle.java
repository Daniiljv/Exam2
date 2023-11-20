package task3;

public class Circle extends Shape {

    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calcSquare() {
        System.out.println("Square of the circle = " + PI * Math.pow(radius, 2));
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Perimeter of circle = " + 2 * PI * radius);
    }

}
