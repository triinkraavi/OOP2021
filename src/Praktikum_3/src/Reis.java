public class Reis {

    private String sihtpunkt;
    private int sihtpunktiKaugus;
    private Lennuk lennuk;
    private int müüdudPiletiteArv;

    public Reis(String sihtpunkt, int sihtpunktiKaugus, Lennuk lennuk, int müüdudPiletiteArv) {
        this.sihtpunkt = sihtpunkt;
        this.sihtpunktiKaugus = sihtpunktiKaugus;
        this.lennuk = lennuk;
        this.müüdudPiletiteArv = müüdudPiletiteArv;
    }

    public String getSihtpunkt() {
        return sihtpunkt;
    }

    public int getSihtpunktiKaugus() {
        return sihtpunktiKaugus;
    }

    public Lennuk getLennuk() {
        return lennuk;
    }

    public int getMüüdudPiletiteArv() {
        return müüdudPiletiteArv;
    }

    public int reisiKestvus(){
        return (int)Math.round(sihtpunktiKaugus*60/lennuk.getKeskmineKiirus());
    }

    public int vabadeKohtadeArv(){
        return lennuk.getMaksReisijateArv() - müüdudPiletiteArv;
    }

    @Override
    public String toString() {
        return "Reis: " +
                "sihtpunkt = '" + sihtpunkt + '\'' +
                ", sihtpunktiKaugus = " + sihtpunktiKaugus +
                ", lennuk = " + lennuk +
                ", müüdudPiletiteArv = " + müüdudPiletiteArv + "\n" +
                ", reisi kestvus = " + reisiKestvus() + "\n" +
                ", vabade kohtade arv = " + vabadeKohtadeArv();
    }
}
