public class Lennuk {
    private String nimi;
    private double keskmineKiirus;
    private int maksReisijateArv;

    public Lennuk(String nimi, double keskmineKiirus, int maksReisijateArv) {
        this.nimi = nimi;
        this.keskmineKiirus = keskmineKiirus;
        this.maksReisijateArv = maksReisijateArv;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getKeskmineKiirus() {
        return keskmineKiirus;
    }

    public void setKeskmineKiirus(double keskmineKiirus) {
        this.keskmineKiirus = keskmineKiirus;
    }

    public int getMaksReisijateArv() {
        return maksReisijateArv;
    }

    public void setMaksReisijateArv(int maksReisijateArv) {
        this.maksReisijateArv = maksReisijateArv;
    }

    @Override
    public String toString() {
        return "Lennuk: " +
                "nimi = '" + nimi + '\'' +
                ", keskmineKiirus = " + keskmineKiirus +
                ", maksReisijateArv = " + maksReisijateArv;
    }
}
