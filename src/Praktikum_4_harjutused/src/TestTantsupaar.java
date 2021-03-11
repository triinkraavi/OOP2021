public class TestTantsupaar {
    public static void main(String[] args) {
        Tantsupaar tantsupaar1 = new Tantsupaar("Karl Erik Taukar", 2001, "Maria Helena Kask", 2003);
        System.out.println(tantsupaar1);
        if(tantsupaar1.kasSündinudSamalAaastal()){
            System.out.println("On sündinud samal aastal");
        }
        else{
            System.out.println("Ei ole sündinud samal aastal");
        }
        System.out.println("Vanema partneri vanus on " + tantsupaar1.vanemaPartneriVanus(2021));



    }
}
