package day3;

public class mod {
    static void main(String[] args){
//        maxxine.greet();
//        maxxine.greetUser("Koushal");
//        int kg = maxxine.squared(9);
//        System.out.println("Sqare is "+kg);
//        double area = maxxine.calculateA(12.5,8.0);
//        System.out.println("Area is "+area);
//        overloading.printi(7);
//        overloading.printi(8.99);
//        overloading.printi("Sorry! My Love");
//        System.out.println(overloading2.sum(2.99,7.99));
//        System.out.println(overloading2.sum(2,3));
//        System.out.println(overloading2.sum(2,3,4));
        int a =isEven.max(1,3,4);
        System.out.println(a);
        boolean b=isEven.demo(6);
        System.out.println(b);
        isEven.overload3();
        isEven.overload3("Demi");
        isEven.overload3("ritika",19);
    }
}

class isEven{
    static boolean demo(int a){
        if (a%2==0) return true;
        else return false;
    }
    static int max(int a, int b, int c){
        if (a>b && a>c) return a;
        else if (b>a && b>c) {
            return b;
        }else return c;
    }
    static void overload3(){
        System.out.println("Hello");
    }
    static void overload3(String a){
        System.out.println("Hello "+a+"!");
    }
    static void overload3(String a, int b){
        System.out.println("Hello! "+a+",you are "+b+" year's old");
    }
}



class maxxine {
    public static void greet() {
        System.out.println("Hello! Welcome to day 3");
    }

    public static void greetUser(String name) {
        System.out.println("Hello," + name + "!");
    }

    public static int squared(int number) {
        return number * number;
    }

    public static double calculateA(double length,double width){
        return length * width;
    }
}

class overloading{
    public static void printi(int num){
        System.out.println("Integer:"+ num);
    }
    public static void printi(double num){
        System.out.println("Double: "+num);
    }
    public static void printi(String message){
        System.out.println("Message: "+message);
    }
}

class overloading2{
    public static int sum(int a,int b){
        return a + b;
    }
    public static int sum(int a,  int b, int c){
        return a + b + c;
    }
    public static double sum(double a, double b){
        return a + b;
    }
}