//Primitive Dta type: used to store values in memory. It stores single values.
public class Main {
    public static void main(String[] args){

//        ByteDataType.demo();
        ShortDataType.demo();
    }
}

//Represents two value true or false.
class BooleanType{
        static void demo(){
                boolean isJavaFun = true;
                boolean isFishTasty= false;
                System.out.println("Is java fun ? "+ isJavaFun);
                System.out.println("Is fish Tasty ? "+ isFishTasty);
            }
}


//Represents  8-bit signed integer used to save memory in large numeric arrays
class ByteDataType{
    static void demo(){
        byte age = 25;
        byte temperature = -10;
        System.out.println("Age: "+age);
        System.out.println("Temperature: "+temperature);
    }
}


//Represents 16-bit signed integer used when memory is limited and values are moderate in size
class ShortDataType{
    static void demo(){
        short students = 1000;
        short temp = -200;
        System.out.println("Students: "+students);
        System.out.println("Temperature: "+temp);
    }
}

// A 32-bit signed integer commonly used for whole numbers.
class IntDataType{
    static void demo(){
        int population = 2000000;
        int distance= 150000000;
        System.out.println("Population: "+population);
        System.out.println("Distance: "+distance);
    }
}
// A 64-bit integer used when int is not sufficient for large values
class longDataType{
    static void demo(){
        long worldPopulation = 782721325L;
        long lightYears = 86876578698756787L;
        System.out.println("worldPopulation: "+ worldPopulation);
        System.out.println("lightYears: "+lightYears);
    }
}

// A 32-bit single-precision floating point type used for fractional values.
class floatDataType{
    static void demo(){
        float pi = 3.14f;
        float gravity= 9.81f;
        System.out.println("Pi: "+pi);
        System.out.println("Gravity: "+ gravity);
    }
}

//A 64-bit double-precision floating type and the default for decimal numbers

class doubleDataType{
    static void demo(){
        double pi = 3.1434836487364387;
        double avogadro = 3124.3284738947;
        System.out.println("Pi: "+pi);
        System.out.println("Avogadro: "+avogadro);
    }
}