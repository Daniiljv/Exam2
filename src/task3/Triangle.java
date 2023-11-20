package task3;

public class Triangle extends Shape {

    private double sideOfRightTriangle;

    public Triangle(double sideOfRightTriangle) {
        this.sideOfRightTriangle = sideOfRightTriangle;
    }

    @Override
    public void calcSquare() {
        System.out.println("Square of the right triangle = " + (Math.pow(sideOfRightTriangle, 2) *
                Math.sqrt(3) / 4));
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Perimeter of rectangle = " + sideOfRightTriangle * 3);
    }
}
