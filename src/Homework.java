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
            public static void sum () {
                int sum = 0; // store the accumulated sum, init to 0
                double average; // average in double
                int lowerbound = 1; // the lower bound to sum
                double upperbound = 100; // the upper bound to sum
                for (int number = lowerbound; number <= upperbound; ++number) {
                    sum += number; // same as "sum = sum + number"
                }
                // Compute average in double.
                average = sum / upperbound;
                System.out.println("The sum = " + sum);
                System.out.println("The average = " + average);
            }
            public static void sum () {
                int sum = 0; // store the accumulated sum, init to 0
                double average; // average in double
                int lowerbound = 1; // the lower bound to sum
                double upperbound = 100; // the upper bound to sum
                while{
                    int number = lowerbound; number <= upperbound; ++number)
                do {

                    sum += number; // same as "sum = sum + number"
                }
                // Compute average in double.
                average = sum / upperbound;
                System.out.println("The sum = " + sum);
                System.out.println("The average = " + average);
            }
                public static void sum () {
                    int sum = 0; // store the accumulated sum, init to 0
                    double average; // average in double
                    int lowerbound = 1; // the lower bound to sum
                    double upperbound = 100; // the upper bound to sum
            do {
                sum += number;
                while{
                    int number = lowerbound; number <= upperbound; ++number)
                    average = sum / upperbound;
                    System.out.println("The sum = " + sum);
                    System.out.println("The average = " + average);
                }
            }
                    int count = 0;
                    for (...; ...; ...) {17.......18.++count;
                }
                    public static void main(String[] args)
                    {
                        int upperBoundNumber = 100;

                        if (upperBoundNumber <= 0) {
                            System.out.println("Error: upperbound less than 0!");
                            return;
                        }

                        SumAndAverage aSumAndAverage = new SumAndAverage();
                        aSumAndAverage.printSumNumbersUsingForLoop(upperBoundNumber);
                        aSumAndAverage.printSumNumbersUsingDoWhileLoop(upperBoundNumber);
                        aSumAndAverage.printSumNumbersUsingWhileDoLoop(upperBoundNumber);
                        aSumAndAverage.printSumNumbersFromRange(111, 8899);
                        aSumAndAverage.printSumOddNumbers(1, 100);
                        aSumAndAverage.printSumNumbersDivisibleBySeven(1, 100);
                        aSumAndAverage.printSumSquares(1, 100);
                    }
                }

            }
        }
    }

    }
