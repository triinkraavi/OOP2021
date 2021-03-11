public class TestHekk {
    public static void main(String[] args) {
        Põõsas põõsas1 = new Põõsas(1.1, 0.3);
        Põõsas põõsas2 = new Põõsas(1.2, 0.6);
        Põõsas põõsas3 = new Põõsas(1.5, 0.7);
        Põõsas põõsas4 = new Põõsas(1.7, 0.3);
        Põõsas põõsas5 = new Põõsas(1.1, 0.8);

        Põõsas[] põõsad = {põõsas1, põõsas2, põõsas3, põõsas4, põõsas5};

        Hekk hekk = new Hekk("Viirpuu", põõsad);
        System.out.println(hekk);
        for (Põõsas põõsas: põõsad) {
            System.out.println(põõsas);

        }
    }
}
