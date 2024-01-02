package HomeWork.HW01.Transport;

public class Aircraft extends Vehicle implements Flyable{
    private int maxAltitude;
    private boolean isFlying;
    private boolean engine=false;
    private boolean brakeMe=true;
    private boolean speedFly=false;
    public Aircraft(int id, String brand, String model, int year, int maxAltitude) {
        super(id, brand, model, year);
        this.maxAltitude = maxAltitude;
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
            speedFly = true;
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
        System.out.println("Максимальная высота полета "+maxAltitude);
        if (isFlying==true) {
            System.out.println("Летим");
        }else {
            System.out.println("Не летим");
        }
    }

    @Override
    public void takeOff() {
        if (engine==true&&brakeMe==false&&speedFly==true) {
            isFlying = true;
            System.out.println("Взлетаем");
        }
    }

    @Override
    public void land() {
        if (engine==true&&brakeMe==false&&speedFly==true) {
            System.out.println("Садимся");
            speedFly =false;
            isFlying = false;
        }
    }
}
