public class Doctor {
    int varsta;
    float greutate;
    float inaltime;
    String nume;
    String experienta;
    Doctor vlad = new Doctor();

    {
        vlad.nume = "Vlad";
        vlad.greutate = 80f;
        vlad.inaltime = 1.80f;
        vlad.varsta = 36;
        vlad.experienta = "10";
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

    public void String setExperienta() {
        this.experienta = experienta;
    }
    public String getExperienta(){
        return this.experienta ;
        }
    }
