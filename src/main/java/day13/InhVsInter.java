package day13;
class InhVsInter {
    public static void main (String[] args)
    {
//        FlyingBird icky = new FlyingBird();
//        icky.feathers();
//        System.out.println("________");
//        icky.fly();
//        System.out.println("_________");
//        Duck ducky = new Duck();
//        ducky.Swimming();
//        ducky.feathers();

        //Gasoline Car
        ModernCar petrolCar = new ModernCar("Swift",new GasolineEngine());
        petrolCar.startEngine();
        petrolCar.drive();

        //Electric Car
        ModernCar tesla = new ModernCar("Model 3", new ElectricMotor());
        tesla.startEngine();
        tesla.drive();
    }
}

interface Flyable{
    default void fly (){
        System.out.println("Hello! i can fly your mail to the loved one");
    }
}

class Bird{
    public Bird(){
        System.out.println("I belong to animal kingdom!!");
    }
    void feathers(){
        System.out.println("i have feathers like structure");
    }
}

class FlyingBird extends Bird implements Flyable {
    public FlyingBird(){
        System.out.println("We belong to the bird species that can fly");
    }
}

interface Swimmable{
    default void Swimming(){
        System.out.println("Hey! i can swim as well");
    }
}


class Duck extends Bird implements Flyable,Swimmable{
    public Duck(){
        System.out.println("Hello! I'm ducky, i can fly as well as swim");
    }
}

interface Startable {
    void start();
}

interface  Drivable{
    void drive();
}

class GasolineEngine implements Startable{
    @Override
    public void start(){
        System.out.println("Gasoline Engine roaring....");
    }
}

class ElectricMotor implements Startable{
    @Override
    public void start() {
        System.out.println("Electric motor silently starting");
    }
}

class ModernCar{
    private Startable engine;
    private String model;

    public ModernCar(String model, Startable engine){
        this.model=model;
        this.engine=engine;
    }

    public void startEngine()
    {
        engine.start();
    }

    public void drive(){
        System.out.println(model+"is driving smoothly");
    }
}


