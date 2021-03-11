public class TestSeade {
    public static void main(String[] args) {
        Seade seade1 = new Seade(100, "Tolmuimeja", 100);
        System.out.println(seade1.getHindKäibemaksuta() + " " + seade1.kmhind());
        System.out.println(seade1.toString());
        seade1.setHindKäibemaksuta(200);
        System.out.println(seade1.toString());

        Seade seade2 = new Seade(101, "Pesumasin", 400);
        Seade seade3 = new Seade(102, "Röster", 60);
        System.out.println(seade2);
        System.out.println(seade3);

    }
}
