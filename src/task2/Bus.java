package task2;

public class Bus extends Vehicle {
    private int capacityOfPassengers;

    public Bus(String make, int year, int capacityOfPassengers) {
        super(make, year);
        this.capacityOfPassengers = capacityOfPassengers;
    }

    @Override
    public void start() {
        System.out.println("Bus has started");
    }

    @Override
    public void stop() {
        System.out.println("Bus has stopped");
    }

    @Override
    public String toString(){
        return "Bus has created in - " + getYear() +
                "\nBus was made by - " + getMake() +
                "\nCapacity of passengers - " + capacityOfPassengers;
    }
}
