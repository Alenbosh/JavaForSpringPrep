package day1;

class Grrok {
    public static void main(String[] args) {
        int age = 25;
        double salary = 50000.50;
        String name = "Alen";
        System.out.println("Name: " + name + " ,Age: " + age + " ,Salary: " + salary);
        ShIntro.demo();
        BmiCalc.demo();
    }
}

// Area of rectangle
class ShIntro {
    static void demo() {
        int length = 10;
        int width = 5;
        int area = length * width;
        System.out.println("Area of rectangle is " + area);
    }
}

// BMI Calculator
class BmiCalc {
    static void demo() {
        double weightKg = 70.5;
        double heightM = 1.75;
        double bmi = weightKg / (heightM + heightM);
        System.out.println("BMI: " + bmi);
    }
}

class swapping1 {
    static void demo() {
        int a = 10, b = 20;
        int temp = a;
        a = b;
        b = temp;
    }
}

class swapping2 {
    static void demo() {
        int a = 10, b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A= " + a);
        System.out.println("B= " + b);
    }
}

class Checkeven {
    static void demo() {
        int num = 42;
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }
}

class Calculator {
    static void demo() {
        double principal = 1000;
        double rate = 5;
        double time = 3;
        double interest = (principal * rate * time) / 100;
        System.out.println("Interest: " + interest);
    }
}

class incrementLogic {
    static void demo() {
        int x = 10;
        System.out.println("X= " + x++);
        System.out.println("X=" + ++x);
    }
}

class Assignment {
    static void demo() {
        int score = 100;
        score += 20;
        score += 2;
        System.out.println("Score: " + score);
    }
}

class AgeChecker {
    static void demo() {
        int age = 19;
        boolean isAdult = age >= 18;
        boolean hasLicense = true;
        boolean canDrive = isAdult && hasLicense;
        System.out.println("Can drive:" + canDrive);

    }
}
