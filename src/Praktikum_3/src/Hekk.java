import java.util.Arrays;

public class Hekk {
    private String hekiNimi;
    private Põõsas[] põõsad;

    public Hekk(String hekiNimi, Põõsas[] põõsad) {
        this.hekiNimi = hekiNimi;
        this.põõsad = põõsad;
    }

    public double kõrgeimPõõsas(){
        double kõrgeim = 0;
        for (Põõsas põõsas: põõsad) {
            if(põõsas.getKõrgus() > kõrgeim){
                kõrgeim = põõsas.getKõrgus();
            }
        }
        return kõrgeim;
    }

    public double hekiPikkus(){
        double pikkus = 0;
        for (Põõsas põõsas: põõsad) {
            pikkus += põõsas.getLaius();

        }
        return pikkus;
    }

    @Override
    public String toString() {
        return "Hekk:" +
                "hekiNimi = '" + hekiNimi + '\'' +
                ", põõsad = " + Arrays.toString(põõsad) +
                "\n, kõrgeim põõsas = " + kõrgeimPõõsas() + ", heki pikkus = " + hekiPikkus();
    }
}
