package day5;

public class VehicleDemo {
    static void main(){
        Car myCar = new Car( "Toyota",2018, 4);
        myCar.start();
        myCar.honk();
        Constructor mine = new Constructor(67);
        mine.maxxine();
        Dog labrador = new Dog();
        labrador.eat();
    }
}

class Vehicle{
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
        System.out.println("Vehicle created");
    }

    public void start(){
        System.out.println(brand+" vehicle is running...");
    }
    public final void honk(){
        System.out.println("Beep Beep!");
    }
}


class Car extends Vehicle{
    private int doors;
    public Car(String brand, int year,int doors){
        super(brand,year);
        this.doors=doors;
        System.out.println("car created with"+doors+"doors");
    }

    @Override
    public void start(){
        super.start();
        System.out.println("...and the engine roars!");
    }
}

class Constructor{
    public static final double PI = 3.14159;
    public static final String APP_NAME ="My Spring App";

    final int maxUsers;
    // why does chaniging name here of constructor messes with the program
    public Constructor(int max){
        this.maxUsers=max;
    }

    public void maxxine(){
        System.out.println("max is "+maxUsers);
    }
}

class Person{
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }

    public void Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void introduce(){
        System.out.println("Hi, I'm"+this.name+", "+this.age+"year's old");
    }
}

// MINI EXERCISES

final class ImmutablePoint{
    final int employeeId;

    public ImmutablePoint(int employeeId){
        this.employeeId=employeeId;
    }

    public void printi(){
        System.out.println("Your Entered employeeId is:");
    }
}

class Animal{
    public void eat(){
        System.out.println("Eating :>>>......");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog is eating.....");
    }
}