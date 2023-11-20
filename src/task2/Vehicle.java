package task2;

public abstract class Vehicle {

    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    abstract void start();

    abstract void stop();

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }
}
