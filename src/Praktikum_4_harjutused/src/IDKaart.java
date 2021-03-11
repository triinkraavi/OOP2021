public class IDKaart {
    private String idKaardiNumber;
    private String nimi;
    private String isikukood;

    public IDKaart(String idKaardiNumber, String nimi, String isikukood) {
        this.idKaardiNumber = idKaardiNumber;
        this.nimi = nimi;
        this.isikukood = isikukood;
    }

    public String getIdKaardiNumber() {
        return idKaardiNumber;
    }

    public void setIdKaardiNumber(String idKaardiNumber) {
        this.idKaardiNumber = idKaardiNumber;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getIsikukood() {
        return isikukood;
    }

    public void setIsikukood(String isikukood) {
        this.isikukood = isikukood;
    }

    public String sugu(){
        char esimene_number = isikukood.charAt(0);
        if (esimene_number == '1' || esimene_number == '3' || esimene_number =='5'){
            return "mees";
        }
        else if (esimene_number == '2' || esimene_number == '4' || esimene_number == '6'){
            return "naine";
        }
        else{
            return null;
        }
    }

    public String sünnikuupäev(){
        String aasta = "";
        String kuupäev = "";
        String kuu = "";
        char esimene_number = isikukood.charAt(0);
        if(esimene_number == '3' || esimene_number == '4'){
            aasta = "19";
        }
        else if (esimene_number == '5' || esimene_number == '6'){
            aasta = "20";
        }
        aasta = aasta + isikukood.substring(1,3);
        kuu = isikukood.substring(3, 5);
        kuupäev = isikukood.substring(5,7);

        return kuupäev + "." + kuu + "." + aasta;
    }

    public String toString(){
        return "Meie isiku nimi on " + nimi + "\n" +
                "Tema sugu on " + sugu() + "\n" +
                "Tema sünnikuupäev on " + sünnikuupäev();
    }
}
