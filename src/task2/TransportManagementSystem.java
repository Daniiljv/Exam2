package task2;

public class TransportManagementSystem {
    public static void main(String[] args) {

        Bike bike = new Bike("Kawasaki", 2023, 320,2);
        Car car = new Car("Mercedes",2023,5, 230);
        Bus bus = new Bus("China", 2023, 12345);

        bike.start();
        System.out.println(bike);
        bike.stop();
        System.out.println();

        car.start();
        System.out.println(car);
        car.stop();
        System.out.println();

        bus.start();
        System.out.println(bus);
        bus.stop();

    }
}
