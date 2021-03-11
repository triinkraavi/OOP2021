public class Taara {
    private String joogiNimi;
    private char pakendiTähis;
    private String jooja;

    public Taara(String joogiNimi, char pakendiTähis, String jooja) {
        this.joogiNimi = joogiNimi;
        this.pakendiTähis = pakendiTähis;
        this.jooja = jooja;
    }

    public String getJoogiNimi() {
        return joogiNimi;
    }

    public char getPakendiTähis() {
        return pakendiTähis;
    }

    public String getJooja() {
        return jooja;
    }

    public static double tagatis(char tähis){
        if(tähis == 'A'){
            return 0.04;
        }
        else if(tähis == 'B' || tähis == 'C' || tähis == 'D'){
            return 0.08;
        }
        else{
            return 0;
        }
    }

    public double taaraMaksumus(){
        return tagatis(pakendiTähis);
    }

    public String toString(){
        String pakenditähisSõnena = pakendiTähis + "";
        return "Joogi nimeks on: " + joogiNimi + "\n" +
                "Pakenditähiseks on: " + pakendiTähis + "\n" +
                "Maksumus on: " + (int)(taaraMaksumus()* 100) + " senti";
    }
}
