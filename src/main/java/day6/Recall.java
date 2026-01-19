package day6;

public class Recall {
    static void main(String[] args){
//        Loop.Car Toyota = new Loop();
//        Toyota.start();
        Loop.Car.stops();
        Loop l = new Loop();
        l.Loop(1);
    }
}

class Variables{
    int maa = 1;
    double naa = 2.13464364;
    String man = "Adi";
    float cho = 3.895F;
}


class Loop {
    public void Loop(int i) {
        for ( i = 1; i < 15; i++) {
            if (i % 3 == 0) {
                continue;
            } else System.out.println(i);
        }
    }

    class Overloading {
        static void display(double a) {
            System.out.println("Given no. is:" + a);
        }

        static void display(int a, int b) {
            System.out.println("Given numbers are" + a + " and " + b);
        }

        static void dispaly(String a) {
            System.out.println("Given String is: " + a);
        }
    }

    class Construct {
        int max;

        public void Construct(int max) {
            this.max = max;
        }
    }

    class Superdooper {
        public void think() {
            System.out.println("i got baseball on my mind.");
        }
    }

    class Hen extends Superdooper {
        @Override
        public void think() {
            super.think();
            System.out.println("i got football and baseball on my mind");
        }
    }


// Final class checking

//    class Finale {
//        final int rollid = 909000;
//
//        public void finale() {
//            rollid = 90;
//        }
//    }


    class Car {
        public void start() {
            System.out.println("Car starts vroom.......");
        }

        static void stops() {
            System.out.println("Car stops at its destination");
        }
    }
}
