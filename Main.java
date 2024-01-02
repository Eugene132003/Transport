package HomeWork.HW01.Transport;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, "Audi", "A4", 2020, 70, 10);
        car.displayInfo();
        car.startEngine();
        car.accelerate(100);
        car.brake();
        car.refuel(40);

        Aircraft aircraft = new Aircraft(2, "Boeing", "747", 2020, 100);
        aircraft.displayInfo();
        aircraft.startEngine();
        aircraft.accelerate(300);
        aircraft.takeOff();
        aircraft.land();
        aircraft.brake();

        Boat boat = new Boat(3, "Bayliner", "212", 2005, 40, false);
        boat.displayInfo();
        boat.startEngine();
        boat.accelerate(20);
        boat.startSwimming();
        boat.stopSwimming();
        boat.brake();

    }
}


