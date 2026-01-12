package day4;

class Counter{
    int instanceCount = 0;
    static int totalObjectCreated = 0;

    public Counter(){
        instanceCount++;
        totalObjectCreated++;
    }

    public void printCounts(){
        System.out.println("Instance Count: "+instanceCount);
        System.out.println("Total objects ever Created: "+ totalObjectCreated);
    }
}


public class StaticVsInstanceDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.printCounts();

        Counter c2 = new Counter();
        c2.printCounts();

        Counter c3 = new Counter();
        System.out.println("Total created from class:"+Counter.totalObjectCreated);
    }
}