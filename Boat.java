package HomeWork.HW01.Transport;

public class Boat extends Vehicle implements Swimmable{
    private int maxSpeed;
    private boolean isSailing;
    private boolean engine=false;
    private boolean brakeMe=true;
    public Boat(int id, String brand, String model, int year, int maxSpeed, boolean isSailing) {
        super(id, brand, model, year);
        this.maxSpeed = maxSpeed;
        this.isSailing = isSailing;
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
            isSailing=true;
            System.out.println("Разгоняемся до "+speed+" узлов");
        }
    }

    @Override
    void brake() {
        if (engine==true&&brakeMe==false) {
            System.out.println("Остановились");
            brakeMe=true;
            isSailing=false;
        }
    }

    @Override
    void displayInfo() {
        System.out.println("ID: "+getId());
        System.out.println("Brand: "+getBrand());
        System.out.println("Model: "+getModel());
        System.out.println("Year: "+getYear());
        System.out.println("Максимальная скорость: "+maxSpeed);
        if (isSailing==true){
            System.out.println("Плывем");
        }else {
            System.out.println("Дрейфуем");
        }
    }

    @Override
    public void startSwimming() {
if (isSailing==true){
    System.out.println("Плывем");
}
    }

    @Override
    public void stopSwimming() {
        if (isSailing==false){
            System.out.println("Дрейфуем");
        }
    }
}
