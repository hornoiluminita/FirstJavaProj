public class Doctor extends Adult {

    String experienta;
    public void String setExperienta() {
        this.experienta = experienta;
    }

    public String getExperienta() {
        return this.experienta;
    }

    public void vorbeste(){ System.out.println("Doctorul vorbeste cu fetita");
    }
    public void consulta (){
        System.out.println("Doctrul consulta cainele");
    }
    public void sejoaca (){
        System.out.println("Doctorul se joaca cu Rex");
    }

    Doctor vlad = new Doctor();

    {
        vlad.nume = "Vlad";
        vlad.greutate = 80f;
        vlad.inaltime = 1.80f;
        vlad.varsta = 36;
        vlad.experienta = "10";

    }
}

