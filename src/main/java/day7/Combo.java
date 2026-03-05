package day7;
import java.util.Scanner;

public class Combo {
    int n=30;
    void printFizzBuzz(int n){
        for (int i=1; i<=n; i++){
            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            }
            else if(i%3==0) System.out.println("Fizz");
            else if(i%5==0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
    int secret=42;
    Scanner sc= new Scanner(System.in);
    int count = 0;
    void guessGame(){
        while (true){
            int guess = sc.nextInt();
                count++;
                if (guess == secret) {
                    System.out.println("You won in "+ count+"Atempts");
                    break;
                }
                else if (guess > secret) System.out.println("Too big\n");
                else System.out.println("Too small \n");
        }
    }

    static double cToF(double c){
        return (c*9)/5 + 32.00;
    }
    static void printTempTable(){
        for (int i=0; i<=100; i+=10){
            System.out.println(i+"c ->"+ cToF(i)+"F");
        }
    }
    void name(String fName, String LName){
        fName= fName.substring(0,1).toUpperCase()+fName.substring(1);
        LName=LName.toUpperCase();
        System.out.println(LName+","+fName);
    }
    void name(String fName, String LName,String MName){
        fName= fName.substring(0,1).toUpperCase()+fName.substring(1);
        LName=LName.toUpperCase();
        System.out.println(LName+","+fName+ ""+ MName);
    }
    public static void main(String[] args){
        Combo c = new Combo();
        c.printFizzBuzz(60);
        c.guessGame();
        printTempTable();
        c.name("Mani","K","uma");
    }
}