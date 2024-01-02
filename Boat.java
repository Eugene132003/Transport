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
            System.out.println("��������� �������");
            engine=true;
        }
    }

    @Override
    void stopEngine() {
        if (engine==true) {
            System.out.println("��������� ����������");
            engine=false;
        }
    }

    @Override
    void accelerate(int speed) {
        if (engine==true&&brakeMe==true) {
            brakeMe=false;
            isSailing=true;
            System.out.println("����������� �� "+speed+" �����");
        }
    }

    @Override
    void brake() {
        if (engine==true&&brakeMe==false) {
            System.out.println("������������");
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
        System.out.println("������������ ��������: "+maxSpeed);
        if (isSailing==true){
            System.out.println("������");
        }else {
            System.out.println("��������");
        }
    }

    @Override
    public void startSwimming() {
if (isSailing==true){
    System.out.println("������");
}
    }

    @Override
    public void stopSwimming() {
        if (isSailing==false){
            System.out.println("��������");
        }
    }
}
