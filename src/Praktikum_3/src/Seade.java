public class Seade {

    private int kood;
    private String nimetus;
    private double hindKäibemaksuta;
    private static double käibemaksuprotsent = 20;

    //konstruktor

    public Seade(int kood, String nimetus, double hindKäibemaksuta) {
        this.kood = kood;
        this.nimetus = nimetus;
        this.hindKäibemaksuta = hindKäibemaksuta;
    }

    public int getKood() {
        return kood;
    }

    public void setKood(int kood) {
        this.kood = kood;
    }

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public double getHindKäibemaksuta() {
        return hindKäibemaksuta;
    }

    public void setHindKäibemaksuta(double hindKäibemaksuta) {
        this.hindKäibemaksuta = hindKäibemaksuta;
    }

    public double kmhind(){
        double hindKäibemaksuga = hindKäibemaksuta + hindKäibemaksuta * käibemaksuprotsent/100;
        return hindKäibemaksuga;
    }

    @Override
    public String toString() {
        return "Seade: " +
                "kood = " + kood +
                ", nimetus = '" + nimetus + '\'' +
                ", hindKäibemaksuta = " + hindKäibemaksuta + ", hindKäibemaksuga = " + kmhind();
    }
}
