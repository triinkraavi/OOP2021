public class Isik {

    private String nimi;
    private double pikkus;

    //konstruktor (saab ka automaatselt teha Code-> Generate kaudu)
    public Isik(String isikuNimi, double isikuPikkus){
        nimi = isikuNimi;
        pikkus = isikuPikkus;
    }

/* Konstruktorit saab kirjutada ka nii:
    public Isik(String nimi, double pikkus) {
        // isendiväljad nimi ja pikkus saavad väärtusteks
        // konstruktori parameetrite väärtused
        this.nimi = nimi;
        this.pikkus = pikkus;
     }
 */
    //võib olla mitu konstruktorit
    public Isik(){
        nimi = "nimetu";
        pikkus = 0.0;
    }

    /* konstruktor võib pöörduda ka teise konstruktori poole:
    public Isik(){
        this("nimetu", 0.0);
    }
     */


    /*Get ja Set luuakse automaatselt Code->Generate
    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getPikkus() {
        return pikkus;
    }

    public void setPikkus(double pikkus) {
        this.pikkus = pikkus;
    }

     */

    public String toString(){
        return "(" + nimi + "; " + pikkus + ")";
    }

    public int suusakepiPikkus(){
        return (int)Math.round(0.85*pikkus*100);
    }
}
