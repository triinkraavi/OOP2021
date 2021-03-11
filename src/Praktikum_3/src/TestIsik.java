public class TestIsik {
    public static void main(String[] args) {
        Isik a = new Isik("Juhan Juurikas", 1.99);
        Isik b = new Isik("Madli Mallikas", 1.55);
        Isik c = new Isik();
        System.out.println("Isik a on " + a);
        System.out.println(a.toString());
        System.out.println(a);
        System.out.println(c);
        System.out.println(a.suusakepiPikkus());

    }
}
