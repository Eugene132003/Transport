package HomeWork.HW01.Transport;

public abstract class Vehicle {
    private int id;
    private String brand;
    private String model;
    private int year;
    public Vehicle(int id, String brand, String model, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    abstract void startEngine();
    abstract void stopEngine();
    abstract void accelerate(int speed);
    abstract void brake();
    abstract void displayInfo();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
    }

}
