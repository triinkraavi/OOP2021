public class TestAmeerikaMäed {
    public static void main(String[] args) {
        IDKaart[] idKaardid = {new IDKaart("50509110230")};
        Õpilaspilet[] õpilaspiletid = {new Õpilaspilet(2005)};
        Juhiluba[] juhiload = {new Juhiluba(2022)};

        AmeerikaMäed ameerikaMäed = new AmeerikaMäed();
        System.out.println(ameerikaMäed.vanusedSobivad(idKaardid, õpilaspiletid, juhiload));
    }
}
