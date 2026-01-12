package day2;

public class Loop {
    public static void main(String[] args){
BasicForLoop.demo();
Dowhile.demo();
dobreak.demo();
    }
}

class BasicForLoop{
    static void demo(){
        for (int i=1; i<=10; i++){
            System.out.println(i+"");
        }
        for (int i=1; i<=20;i++){
            if (i%2==0) System.out.println(i);
        }
    }
}

class dobreak{
    static void demo(){
        for (int i =1; i<=42; i+=3){
            if (i==10){
                System.out.println("Found 10!");
                break;
            }
        }
    }
}

class Dowhile{
    static void demo(){
        int secret=3000;
        int guess=2000;
        do{
            System.out.println("Guess:"+guess);
            guess+=100;
        }
        while(guess!=secret);
        System.out.println("Correct!"+secret);
    }
}
