public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("Luminita");
        int x = 7;
        int y = 8;
        int addition = x + y;
        System.out.println(" The addition of " + x + " and " + y + "is: " + addition);
        System.out.println("x+y ");
        int divide = x / y;
        System.out.println(" x/y ");

        int res = scadere(2, 3);
        System.out.println(res);

        int res2 = inmultire(2, 3);
        System.out.println(res2);


        int res3 = impartire(2, 3);
        System.out.println(res3);
    }

    public static int scadere(int primulnumar, int aldoileanumar) {
        int resultat = primulnumar - aldoileanumar;
        return resultat;
    }

    public static int inmultire(int primulnumar, int aldoileanumar) {

        int resultat2 = primulnumar * aldoileanumar;
        return resultat2;
    }


    public static int impartire(int primulnumar, int aldoileanumar) {

        int resultat3 = primulnumar / aldoileanumar;
        return resultat3;

    }

    Fetita alina = new Fetita();
    alina.nume ="Alina";
    alina.greutate=20f;
    alina.varsta=6;
    alina.inaltime=1;
    Doctor vlad = new Doctor();
    vlad.nume="Vlad";
    vlad.greutate=80f;
    vlad.varsta=36;
}
Mancare caine =new Mancare();



}
