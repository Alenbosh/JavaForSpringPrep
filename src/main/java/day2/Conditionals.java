package day2;

public class Conditionals {
    static void main(String[] args){
        GradeChecker.demo();
        SwitchCase.demo();
        NumberCheck.demo();
        Ternaryoperator.demo();
    }
}

class SwitchCase{
    static void demo(){
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}




class GradeChecker{
     static void demo(){
         int number =38;
        if(number>=90) System.out.println("A");
        else if (number>=75) {
            System.out.println("B");
        } else if (number>=35) {
            System.out.println("passed");
        } else if (number >=0 && number <=35) {
            System.out.println("Failed");
        }
    }
}

class NumberCheck{
    static void demo(){
        int number=7;
        if(number>0){
            System.out.println("Positive");
        } else if (number<0) {
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
    }
}


class Ternaryoperator{
    static void demo(){
        int age = 20;
        String status = (age>=18)?"Adult":"Minor";
        System.out.println(status);
    }
}

