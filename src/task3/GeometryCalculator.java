package task3;

public class GeometryCalculator {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10,10);
        Triangle triangle = new Triangle(10);

        circle.calcPerimeter();
        circle.calcSquare();
        System.out.println();

        rectangle.calcPerimeter();
        rectangle.calcSquare();
        System.out.println();

        triangle.calcPerimeter();
        triangle.calcSquare();
    }
}
