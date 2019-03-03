public class Homework {
    import java.util.Scanner;

    public static void main(String[] args) {
        System.out.println("3\n" + "Hello World!");
    }

    //
//        public static void countnumber (); {
//
//
//            for (int i = 7; i < 10; i--) ;
//            System.out.println(i);
//
//    public static void sum(int i) {
//        int rezultat = 0;
//        while (i <= 100) {
//            if (i % 2 != 0) {
//                rezultat = rezultat + i;
//            }
//            i++;
//            System.out.println(rezultat);
//        }
    public static void sum(int s) {

        int l = 0;
        while (l <= 100) {
            System.out.print("s");
        }
    }

    public static void countnumber() {
        for (int i = 10; i > 0; i--) {
            System.out.println("i = " + i);
        }
    }

    public static void printPattern() {

        int i, j, k;

        for (i = 1; i <= 7; i++) {
            for (j = 1; j <= i; ++j)
                System.out.print(j);

            for (k = 7 - i; k >= 1; k--)
                System.out.print("*");

            System.out.println("");
        }
    }

    public static void sumandaverage() {
        int num = 100, sum = 0;

        for (int i = 1; i <= num; ++i) {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Average is :" + sum / 50);
    }

    public static void sumaverage() {
        int num = 100, sum = 0;
        int i = 1;
        do {
            System.out.println("Sum = " + sum);
            i++;
            sum += i;
            System.out.println("Average is :" + sum / 50);
        } while (i <= num);

    }

    public static void sumcount() {
        int count = 0;
        int num = 8899;
        int i = 111;

        for (i <= 8899) {
            ++count;
        }
    }
}




