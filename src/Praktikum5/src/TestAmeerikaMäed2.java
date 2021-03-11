public class TestAmeerikaMäed2 {
    public static void main(String[] args) {
        AmeerikaMäed2 mäed = new AmeerikaMäed2();
        Dokument[] dokumendid = {new IDKaart("37809110230"),
                new Õpilaspilet(2005),
                new Juhiluba(2022)};
        System.out.println("sobib: " + mäed.vanusedSobivad2(dokumendid));
    }
}
