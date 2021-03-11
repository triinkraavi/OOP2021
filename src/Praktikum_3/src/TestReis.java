public class TestReis {
    public static void main(String[] args) {
        Lennuk lennuk1 = new Lennuk("Fokker F50", 530, 46);
        Lennuk lennuk2 = new Lennuk("BN-2", 170, 9);
        Reis reis1 = new Reis("Helsingi", 271, lennuk1, 10);
        Reis reis2 = new Reis("Riia", 245, lennuk2, 5);
        Reis reis3 = new Reis("Pariis", 1908, lennuk1, 45);
        System.out.println(reis1.toString());
        System.out.println(reis2.toString());
        System.out.println(reis3.toString());
    }
}
