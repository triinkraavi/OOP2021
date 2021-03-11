public class Isik2 {

    private String nimi;
    private double pikkus;

    public Isik2(String isikuNimi, double isikuPikkus) {
        nimi = isikuNimi;
        pikkus = isikuPikkus;
    }

    public int suusakepiPikkus() {
        return (int) Math.round(0.95 * pikkus * 100);
    }

    public static void main(String[] args) {
        Isik2 isik = new Isik2("Helle", 1.65);
        System.out.println("suusakepi pikkus on " + isik.suusakepiPikkus());
    }
}
