public class Calculator {
    int x = 7;
    int y = 8;
    int addition = x + y;
    { System.out.println("x+y ");}
    public int addition () {
        int result = x + y;
        System.out.println(" The addition of " + x + " and " + y + "is: " + addition);
        return result;
    }
    int divide = x / y;{
            System.out.println(" x/y ");
        {
        public int divide ()
        int result = x / y;
        return result;
    }


    int res = scadere(2, 3);
            System.out.println(res);

    int res2 = inmultire(2, 3);
            System.out.println(res2);


    int res3 = impartire(2, 3);
            System.out.println(res3);

}


                Scanner scan = new Scanner(System.in);{
                System.out.println("Enter the first number:");
                int num1 = scan.nextInt();
                System.out.println("Enter the second number:");
                int num2 = scan.nextInt();
                int x = scan.nextInt();
                System.out.println("num1 + "+ x +" + num2 num1+ num2");
                }
public  int scadere ( int primulnumar, int aldoileanumar){
        int resultat = primulnumar - aldoileanumar;
        return resultat;
        }

public  int inmultire ( int primulnumar, int aldoileanumar){

        int resultat2 = primulnumar * aldoileanumar;
        return resultat2;
        }


public int impartire ( int primulnumar, int aldoileanumar){
        int resultat3 = primulnumar / aldoileanumar;
        }

public  void averageThreeNumbers(){
        java.util.Scanner scan = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The average value is " + average(x, y, z) + "\n");
        }
        System.out.println("Enter the first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scan.nextInt();
        int x = scan.nextInt();
        System.out.println("num1 + "x" + num2 " = " num1*num2");
        }
        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " + " + num2 + " = " +
        (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " +
        (num1 - num2));

        System.out.println(num1 + " x " + num2 + " = " +
        (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " +
        (num1 / num2));

        System.out.println(num1 + " mod " + num2 + " = " +
        (num1 % num2));


        java.util.Scanner scan = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The average value is " + average(x, y, z) + "\n");
        }
public  double average ( double x, double y, double z) {

        return (x + y + z) / 3;
        }
public void calculateSpeed (){
        Scanner scanner = new Scanner(System.in);

        float timeSeconds;
        float mps, kph, mph;

        System.out.print("Input distance in meters: ");
        float distance = scanner.nextFloat();

        System.out.print("Input hour: ");
        float hr = scanner.nextFloat();

        System.out.print("Input minutes: ");
        float min = scanner.nextFloat();

        System.out.print("Input seconds: ");
        float sec = scanner.nextFloat();

        timeSeconds = (hr * 3600) + (min * 60) + sec;
        mps = distance / timeSeconds;
        kph = (distance / 1000.0f) / (timeSeconds / 3600.0f);
        mph = kph / 1.609f;

        System.out.println("Your speed in meters/second is " + mps);
        System.out.println("Your speed in km/h is " + kph);
        System.out.println("Your speed in miles/h is " + mph);
        scanner.close();
        }

public void calculateInch() {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");

        }
public void doCalculation() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();


        System.out.println(num1 + " + " + num2 + " = " +
        (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " +
        (num1 - num2));

        System.out.println(num1 + " x " + num2 + " = " +
        (num1 * num2));

        System.out.println(num1 + " / " + num2 + " = " +
        (num1 / num2));

        System.out.println(num1 + " mod " + num2 + " = " +
        (num1 % num2));
        }
public void calculateTemperature() {
        float temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit");
        temperature = in.nextInt();

        temperature = ((temperature - 32) * 5) / 9;

        System.out.println("temperature in Celsius = " + temperature);

        }