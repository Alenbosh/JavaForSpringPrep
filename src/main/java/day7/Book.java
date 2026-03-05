package day7;
public class Book{
    static int totalBooks=0;
    String title;
    public Book(int totalBooks, String title){
        totalBooks++;
        this.title = title;
    }
    public static void main(String[] args){
        Book b1 = new Book(3,"Ramada Club");
        Book b2 = new Book(3,"HG WELL'S INVISISBLE MAN");
        Book b3 = new Book(3,"AKOSK");
    }
    class Rectangle{
        int length;
        int breadth;
        int width;
        double l;
        double w;
        public Rectangle(int length, int breadth, int width){
            this.length=length;
            this.breadth=breadth;
            this.width=width;
        }
        void setDimenions(double l, double w){
            this.l =l;
            this.w=w;
        }
    }
    class MathHelper{
        static final double taxRate=0.18;
        double price;
        double calcTax(){
            double sum = price + taxRate * price;
            return sum;
        }
    }
}
