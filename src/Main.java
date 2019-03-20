import animalrescues.*;
import animalrescues.calculator.Calculator;
import animalrescues.calculator.OperatiiLogice;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

       Calculator calc = new Calculator();
       OperatiiLogice op = new OperatiiLogice();
       Dog rex = new Dog();

           rex.setNume("Rex");
           rex.setNume("Grivei");
           System.out.println(rex.getNume());
           rex.setVarsta("3");
           System.out.println(rex.getVarsta());
           rex.setGreutate("15.5");
           System.out.println(rex.getGreutate());
           rex.setRasa("DOBERMAN");
           System.out.println(rex.getRasa());
           rex.setCuloare("Negru");
           System.out.println(rex.getCuloare);

       Fetita alina = new Fetita();
       {
           alina.setNume("Alina");
           System.out.println(alina.getNume());
           alina.setGreutate("20f");
           System.out.println(alina.getGreutate());
           alina.setVarsta("6");
           System.out.println(alina.getVarsta());
           alina.setInaltime("1");
           System.out.println(alina.getInaltime());
           alina.setNationalitate("Romana");
           System.out.println(alina.getNationalitate());

       }
       Doctor vlad = new Doctor();
       {
           vlad.setNume("Vlad");
           System.out.println(vlad.getNume());
           vlad.setGreutate("75");
           System.out.println(vlad.getGreutate());
           vlad.setVarsta("36");
           System.out.println(vlad.getVarsta());
           vlad.setInaltime("1.80f");
           System.out.println(vlad.getInaltime());
           vlad.setExperienta("10");
           System.out.println(vlad.getExperienta());
       }
       Mancare royal = new Mancare();
       {
           royal.setDenumire("Royal");
           System.out.println(royal.getDenumire());
           royal.setCantitate("1");
           System.out.println(royal.getCantitate());
           royal.setGust("dulce");
           System.out.println(royal.getGust());
           royal.setMiros "Intepator";
           System.out.println(royal.getMiros());
           royal.setCuloare("maro");
           System.out.println(royal.getCuloare());
           Cat ada = new Cat();
           {
               ada.setNume("Ada");
               System.out.println(ada.getNume());
               ada.setVarsta("2");
               System.out.println(ada.getVarsta());
               ada.setGreutate("2");
               System.out.println(ada.getGreutate());
               ada.setRasa("Siameza");
               System.out.println(ada.getRasa());
               ada.setCuloare("Maro");
               System.out.println(ada.getCuloare);
           }
           public static void checkNumber () {
           int x = 10;
           int y = 3;
           if (x < y) {
               System.out.println("x e mai mic");
           } else if (x == y) {
               System.out.println("x este egal cu y");
           } else if (x > y) {

               System.out.println("x este mai mare");
           }
           public static void checkText () {
               String text = "text";
               if text = "FastTrack" {
                   System.out.println("Learning text omparison");
               }else{
                   System.out.println("Got to try some more");

               }
           }
           public void checkint () {
               int x = 7;
               int y = 2;
               int z = 8;
               if (x >= y) {
                   System.out.println("x");
               } else if (x <= y) {
               }
               System.out.println("x");
           }
           public void checkinttext () {
               int x = 3;
               int y = 4;
               String number = number;
               String text = text;
               String text = "FastTrack";
               if (number <= 3) {
                   System.out.println("FastTrack\n" + "number");
               } else if (number >= 4) {
                   System.out.println("number\n" + "Hello");
               }
           }
           public void checkcondition () {
               int x = 7;
               if ((x > 8) && (x = 6)) {
                   System.out.println("The amount of snow this winter was 3cm" + "x");
               } else
                   System.out.println("The forecast snow is 5 cm");
           }
           public void checknumbers () {
               int x = 10;
               if ((x > 3) %%(x != 4)){
                   System.out.println("The number is greater than 3 and not equal to 4");
               } else if (x == 4) {
                   System.out.println("The number is equal to 4");
               } else if (x < 3) {
                   System.out.println("The number is lower than 3");
               }
           }
           public void switchCaseMethod () {
               System.out.println("Introdu un numar");
               Scanner scan = new Scanner(System.in);
               int number = scan.nextInt();
               switch (number) {
                   case 1:
                       System.out.println("1");
                   case 2:
                       System.out.println("2");
                   case 3:
                       System.out.println("3");
                   case 4:
                       System.out.println("4");
                   case 5:
                       System.out.println("5");
                   case 6:
                       System.out.println("6");
                   case 7:
                       System.out.println("7");
                   case 8:
                       System.out.println("8");
                   case 9:
                       System.out.println("9");
                   case 10:
                       System.out.println("10");
                   default:
                       System.out.println("Not allowed");
                       break;
               }
           }
           public void evennumber () {
               System.out.println("Introdu un numar");
               Scanner in = new Scanner(System.in);
               System.out.print("Input a number: ");
               int n = in.nextInt();
               if (n % 2 == 0) {
                   System.out.println("The number is an even number");
               }
           }
           public void age () {
               int age;
               Scanner in = new Scanner(System.in);
               System.out.println("Enter your age : ");
               age = in.nextInt();
               if (age >= 18) {
                   System.out.println("The person is eligible for voting");
               }
           }
           public void numbers () {
               int x, y, z;
               System.out.println("Enter three numbers");
               Scanner in = new Scanner(System.in);

               x = in.nextInt();
               y = in.nextInt();
               z = in.nextInt();

               if (x > y && x > z) {
                   System.out.println("First number is the greatest.");
               } else if (y > x && y > z) {
                   System.out.println("Second number is the greatest.");
               } else if (z > x && z > y) {
                   System.out.println("Third number is the greatest.");
               }
           }
           public void readnumber () {
               Scanner scan = new Scanner(System.in);
               System.out.print("Enter any number: ");
               int num = scan.nextInt();
               scan.close();
               System.out.println("The number entered by user: " + num);
           }
           public void squarenumber () {
               Scanner sc = new Scanner(System.in);
               int x;
               System.out.print("Enter an integer number: ");
               x = sc.nextInt();
               int square = x * x;
               System.out.println("Square of  x  is:");
           }
           public void dividenumbers () {
               int a = 6;
               int b = 3;
               int c = x / y;
               System.out.println("The result of the operation is: " + c);
           }
           public void maxnumber () {

               double n1 = 3, n2 = 2.9, n3 = 5.5;

               if (n1 >= n2) {
                   if (n1 >= n3)
                       System.out.println(n1 + " is the maxim number.");
                   else
                       System.out.println(n3 + " is the maxim number.");
               } else {
                   if (n2 >= n3)
                       System.out.println(n2 + " is the maxim number.");
                   else
                       System.out.println(n3 + " is the maxim number.");
               }
           }
           public void int max ( int a, int b, int c, int d){

               int max = a;

               if (b > max)
                   max = b;
               if (c > max)
                   max = c;
               if (d > max)
                   max = d;

               return max;
               System.out.println("max");
           }
           public static int getMaxValue ( int[] numbers){
               int maxValue = numbers[0];
               for (int i = 1; i < numbers.length; i++) {
                   if (numbers[i] > maxValue) {
                       maxValue = numbers[i];
                   }
               }
               return maxValue;
               System.out.println("maxValue");
           }
           public static int getMinValue ( int[] numbers){
               int minValue = numbers[0];
               for (int i = 1; i < numbers.length; i++) {
                   if (numbers[i] < minValue) {
                       minValue = numbers[i];
                   }
               }
               return minValue;
               System.out.println("minValue");
           }
           public void twonumbers (); {
               int x = 10;
               int y = 3;
               if (x < y) {
                   System.out.println("x ");
                   System.out.println("y");

               } else if (x > y) {

                   System.out.println("y");
                   System.out.println("x");
               }
           }
       }
       }

   }