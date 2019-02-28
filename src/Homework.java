public class Homework {
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            sum(1);
            System.out.println("3\n" + "Hello World!");
        }

        //
//        public static void countnumber (); {
//
//
//            for (int i = 7; i < 10; i--) ;
//            System.out.println(i);
//
        public static void sum (int i) {
            int rezultat = 0;
            while (i<=100) {
                if (i % 2 != 0) {
                    rezultat = rezultat + i;
                }
                i++;
                System.out.println(rezultat);}

            i = 0;
            while (i <= 100)
            {
                System.out.print(i + " ");}
            public static void countnumber() {
                for (int i = 10; i > 0; i--) {
                    System.out.println("i = " + i);
                }
            }
            for(int PatternB = 0; PatternB <=10; PatternB++) { // outer loop Pattern B
                for(int PatternBI = 9; PatternBI >= PatternB; PatternBI--) { //Inner Loop
                    System.out.print("+");
                }
                System.out.println();
            }
        }



    }
