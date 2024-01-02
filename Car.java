package HomeWork.HW01.Transport;

public class Car extends Vehicle{
    private boolean engine=false;
    private boolean brakeMe=true;
    private int fuelCapacity;
    private int currentFuelLevel;

    public Car(int id, String brand, String model, int year,int fuelCapacity, int currentFuelLevel) {
        super(id, brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    void startEngine() {
        if (engine==false) {
            System.out.println("Двигатель запущен");
            engine=true;
          }
    }

    @Override
    void stopEngine() {
        if (engine==true) {
            System.out.println("Двигатель остановлен");
            engine=false;
        }
    }

    @Override
    void accelerate(int speed) {
        if (engine==true&&brakeMe==true) {
            brakeMe=false;
            System.out.println("Разгоняемся до "+speed+" км/ч");
        }
    }

    @Override
    void brake() {
        if (engine==true&&brakeMe==false) {
            System.out.println("Остановились");
            brakeMe=true;
        }
    }

    @Override
    void displayInfo() {
        System.out.println("ID: "+getId());
        System.out.println("Brand: "+getBrand());
        System.out.println("Model: "+getModel());
        System.out.println("Year: "+getYear());
        System.out.println("Емкость бака: "+fuelCapacity+", залито "+currentFuelLevel+" литров");
        if (brakeMe==false) {
            System.out.println("Едем");
        }else {
            System.out.println("Стоим");
        }
    }

    void refuel(int liters){
        System.out.println("Заправились на "+ liters);
    }
    public int getFuelCapacity() {return fuelCapacity;}
}
