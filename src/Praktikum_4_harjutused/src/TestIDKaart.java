public class TestIDKaart {
    public static void main(String[] args) {
        IDKaart idKaart = new IDKaart("A94381452", "Tiiu Tubli", "37112021092");

        System.out.println("Meie isiku sugu on: " + idKaart.sugu());
        System.out.println("Meie isiku sünnikuupäev on: " + idKaart.sünnikuupäev());
        System.out.println(idKaart.toString());
    }
}
