public class Homework {


        public static void main(String[] args) {
            System.out.println( "Hello World!");
        }

        public static void sum () {

            int l = 0;
            while (l <= 100) {
                System.out.println("l");
            }
        }
        public static void countnumber () {
            for (int i = 10; i > 0; i--) {
                System.out.println("i = " + i);
            }
        }

        public static void printPattern () {

            int i, j, k;

            for (i = 1; i <= 7; i++) {
                for (j = 1; j <= i; ++j)
                    System.out.print(j);

                for (k = 7 - i; k >= 1; k--)
                    System.out.print("*");

                System.out.println("");
            }
        }
        public static void sumandaverage () {
            int num = 100, sum = 0;

            for (int i = 1; i <= num; ++i) {
                // sum = sum + i;
                sum += i;
            }

            System.out.println("Sum = " + sum);
            System.out.println("Average is :" + sum / 50);
        }
        public static void sumaverage () {
            int num = 100, sum = 0;
            int i = 1;
            do {
                System.out.println("Sum = " + sum);
                i++;
                sum += i;
                System.out.println("Average is :" + sum / 50);
            } while (i <= num);
        }
        public static void sumcount () {
            int count = 0;

            for (int i = 111; i <= 8899; ) {
                ++count;
            }
            System.out.println(count);
        }
        public static void sumnumber () {

            int rezultat = 0;
            for (int v = 1; v <= 100; v++) {
                if (v % 2 != 0) {
                    rezultat = rezultat + v;
                }
            }
            System.out.println(rezultat);
        }
        public static void sumdiv () {

            int rezultat = 0;
            for (int m = 1; m <= 100; m++) {
                if (m % 7 == 0) {
                    rezultat = rezultat + m;
                }
            }
            System.out.println(rezultat);
        }
        public static void fibonacci () {
            int a = 0, b = 1, c, count = 2;
            System.out.print(a + ",");
            System.out.print(b + ",");
            while (count != 20) {
                c = a + b;
                count++;
                System.out.print(c + ",");
                a = b;
                b = c;
            }
        }
        public static void coza () {
            int max = 110;
            for (int i = 1; i <= max; i++) {
                if (i % 3 == 0)
                    System.out.print("Coza");
                else if (i % 5 == 0)
                    System.out.print("Woza");
                else if (i % 7 == 0)
                    System.out.print("CozaLoza");
                else if (i % 3 != 0 || i % 5 != 0 || i % 7 != 0)
                    System.out.print(i);
                if (i % 11 == 0)
                    System.out.println("");
            }
        }
    }


