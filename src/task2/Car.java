package task2;

public class Car extends Vehicle {
    private int countOfDoors;
    private double maxSpeed;

    public Car(String make, int year,int countOfDoors, double maxSpeed) {
        super(make, year);
        this.countOfDoors = countOfDoors;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("Car has started");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");
    }
    @Override
    public String toString(){
        return "Car has created in - " + getYear() +
                "\nCar was made by - " + getMake() +
                "\nMax speed of bike - " + maxSpeed +
                "\nCount of doors - " + countOfDoors;
    }
}
