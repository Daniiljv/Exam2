package task2;

public class Bike extends Vehicle {
    private double maxSpeed;
    private int countOfWheels;

    public Bike(String make, int year, double maxSpeed, int countOfWheels) {
        super(make, year);
        this.maxSpeed = maxSpeed;
        this.countOfWheels = countOfWheels;
    }

    @Override
    public void start() {
        System.out.println("Bike has started");
    }

    @Override
    public void stop() {
        System.out.println("Bike has stopped");
    }
    @Override
    public String toString(){
        return "Bike has created in - " + getYear() +
                "\nBike was made by - " + getMake() +
                "\nMax speed of bike - " + maxSpeed +
                "\nCount of wheels - " + countOfWheels;
    }
}
