public class Testarv {
    public static void main(String[] args) {
        int arv1 = 1632;
        int arv2 = arv1;
        arv2 = 1802;
        System.out.println(arv1);
        System.out.println(arv2);

        Arv viitarv1 = new Arv();
        viitarv1.arv = 1632;
        Arv viitarv2 = new Arv();
        viitarv2 = viitarv1;
        viitarv2.arv = 1802;
        System.out.println("viitarv1.arv on: " + viitarv1);
        System.out.println("viitarv2.arv on: " + viitarv2);

        int[] arvud1 = {1632};
        int[] arvud2 = arvud1;
        arvud2[0] = 1802;
        System.out.println("arvud1[0] on: " + arvud1[0]);
        System.out.println("arvud2[0] on: " + arvud2[0]);
    }

}
