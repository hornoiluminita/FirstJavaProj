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
            int[] myArray = new int[100];
        for (int i=0;i<100;i++)

    {
        myArray[i] = i + 1;
    }
        for (int i=0;i<100;i++)

    {
        System.out.println(myArray[i]);
    }


        public static void average (String[] args) {

            int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
            int sum = 0;
            for(int i=0; i < numbers.length ; i++)
                sum = sum + numbers[i];
            double average = sum / numbers.length;
            System.out.println("Average value of the array elements is : " + average);
        }

        public static void grid (String[] args) {
            int [][]a = new int[10][10];
            for(int i = 0; i < 10; i++)
            {
                for(int j = 0; j < 10; j++)
                {
                    System.out.printf("- ", a[i][j]);
                }
                System.out.println();
            }
        }

    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void specificvalue(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
        System.out.println(contains(my_array1, 2013));
        System.out.println(contains(my_array1, 2015));
    }
      import java.util.Arrays;
    public static int  findIndex (int[] my_array, int t) {

        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Index position of 25 is: " + findIndex(my_array, 25));
        System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
    }
    public static void main(String[] args) {
         import java.util.Arrays;
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("Original Array : "+Arrays.toString(my_array));
        int removeIndex = 1;
        for(int i = removeIndex; i < my_array.length -1; i++){
            my_array[i] = my_array[i + 1];
        }
        System.out.println("After removing the second element: "+Arrays.toString(my_array));
    }
    public static void smallest (String args[]){
        int temp, size;
        int array[] = {10, 20, 25, 63, 96, 57};
        size = array.length;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("2nd Smallest element of the array is:: "+array[0]);
    }
import java.util.Arrays;
    public static void copyarray(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] new_array = new int[10];

        System.out.println("Source Array : "+Arrays.toString(my_array));

        for(int i=0; i < my_array.length; i++) {
            new_array[i] = my_array[i];
        }
        System.out.println("New Array: "+Arrays.toString(new_array));
    }
import java.util.Arrays;
    public static void insertelement(String[] args) {

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int Index_position = 2;
        int newValue    = 5;

        System.out.println("Original Array : "+Arrays.toString(my_array));

        for(int i=my_array.length-1; i > Index_position; i--){
            my_array[i] = my_array[i-1];
        }
        my_array[Index_position] = newValue;
        System.out.println("New Array: "+Arrays.toString(my_array));
    }

import java.util.Arrays;
    static int max;
    static int min;

    public static void max_min(int my_array[]) {
        max = my_array[0];
        min = my_array[0];
        int len = my_array.length;
        for (int i = 1; i < len - 1; i = i + 2) {
            if (i + 1 > len) {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i] < min) min = my_array[i];
            }
            if (my_array[i] > my_array[i + 1]) {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i + 1] < min) min = my_array[i + 1];
            }
            if (my_array[i] < my_array[i + 1]) {
                if (my_array[i] < min) min = my_array[i];
                if (my_array[i + 1] > max) max = my_array[i + 1];
            }
        }
    }

    public static void reversearray(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        max_min(my_array);
        System.out.println(" Original Array: "+Arrays.toString(my_array));
        System.out.println(" Maximum value for the above array = " + max);
        System.out.println(" Minimum value for the above array = " + min);
    }
import java.util.Arrays;
    public static void duplicateinteger(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        System.out.println("Original array : " + Arrays.toString(my_array1));
        for (int i = 0; i < my_array1.length / 2; i++) {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }
        System.out.println("Reverse array : " + Arrays.toString(my_array1));
    }
    import java.util.Arrays;
        public static void duplicatestring (String[] args)
        {
            int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};

            for (int i = 0; i < my_array.length-1; i++)
            {
                for (int j = i+1; j < my_array.length; j++)
                {
                    if ((my_array[i] == my_array[j]) && (i != j))
                    {
                        System.out.println("Duplicate Element : "+my_array[j]);
                    }
                }
            }
        }
        public static void twoarrays(String[] args)
        {
            String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

            for (int i = 0; i < my_array.length-1; i++)
            {
                for (int j = i+1; j < my_array.length; j++)
                {
                    if( (my_array[i].equals(my_array[j])) && (i != j) )
                    {
                        System.out.println("Duplicate Element is : "+my_array[j]);
                    }
                }
            }
        }
    import java.util.Arrays;
        public static void main(String[] args)
        {
            String[] array1 = {"GRI", "PORTOCALIU", "MOV", "ROSU", "ALB"};

            String[] array2 = { "MARO", "NEGRU", "ALB", "MOV", "ROZ", "VERDE"};

            System.out.println("Array1 : "+Arrays.toString(array1));
            System.out.println("Array2 : "+Arrays.toString(array2));

            HashSet<String> set = new HashSet<String>();

            for (int i = 0; i < array1.length; i++)
            {
                for (int j = 0; j < array2.length; j++)
                {
                    if(array1[i].equals(array2[j]))
                    {
                        set.add(array1[i]);
                    }
                }
            }

            System.out.println("Common element : "+(set));
        }
    }




