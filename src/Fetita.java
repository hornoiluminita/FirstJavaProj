public class Fetita {
    int varsta;
    float greutate;
    String nume;
    float inaltime;
    String nationalitate ;
    Fetita alina = new Fetita();
    {

        alina.nume = "Alina";
        alina.greutate = 20f;
        alina.varsta = 6;
        alina.inaltime = 1;
        alina.nationalitate ="Romana";
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getNume() {
        return this.nume;
    }
    public void setVarsta(int varsta){
        this.varsta=varsta;
    }
    public int getVarsta () {
        return this.varsta;
    }
    public void  setGreutate(){
        this.greutate= greutate;
    }
    public float getGreutate(){
        return this.greutate;
    }
    public void String setInaltime () {
        this.inaltime = inaltime;
    }
    public String getInaltime () {
        return this.inaltime;
    }
    public void String setNationalitate (){
        this.nationalitate = nationalitate ;
        public String getNationalitate () {
            return this.nationalitate ;
        }
    public void vorbeste(){ System.out.println("Fetita vorbeste cu cainele");
    }
    public void sejoaca (){
        System.out.println("Fetita se joaca cu Dog");
    }
    public void adopta (){
        System.out.println("Fetita il adopta pe Dog");
    }
}
