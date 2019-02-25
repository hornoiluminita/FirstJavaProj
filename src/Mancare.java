public class Mancare {
    int cantitate;
    String gust;
    String denumire;
    String miros ;
    String culoare;
    Mancare mancare = new Mancare();
    {

        mancare.denumire = " Royal";
        mancare.cantitate = 1;
        mancare.gust = " dulce ";
        mancare.miros ="intepator";
        mancare.culoare ="maro";
    }
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
    public String getDenumire() {
        return this.denumire;
    }
    public void setCantitate(int cantitate){
        this.cantitate = cantitate;
    }
    public int getCantitate () {
        return this.cantitate;
    }
    public void  setGust(){
        this.gust= gust;
    }
    public String getGust(){
        return this.gust;
    }
    public void String setMiros () {
        this.miros = miros;
    }
    public String getMiros(){
        return this.miros;
    }
    public void String setCuloare(){
        this.culoare = culoare;
    }
    public String getCuloare () {
        return this.culoare;
    }

    }
