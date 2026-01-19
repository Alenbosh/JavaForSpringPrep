package day11;

public class PolymorphismDemo {

}

class Animal{
    protected String name;

    public Animal(String name){
        this.name=name;
    }

    public void makeSound(){
        System.out.println(name+"make a generic animal sound");
    }

    public void eat(){
        System.out.println(name+"is eating food");
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
}