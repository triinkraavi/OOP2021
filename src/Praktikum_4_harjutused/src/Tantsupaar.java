public class Tantsupaar {
    private String poisiNimi;
    private int poisiSünniaasta;
    private String tüdrukuNimi;
    private int tüdrukuSünniaasta;

    public Tantsupaar(String poisiNimi, int poisiSünniaasta, String tüdrukuNimi, int tüdrukuSünniaasta) {
        this.poisiNimi = poisiNimi;
        this.poisiSünniaasta = poisiSünniaasta;
        this.tüdrukuNimi = tüdrukuNimi;
        this.tüdrukuSünniaasta = tüdrukuSünniaasta;
    }

    public String getPoisiNimi() {
        return poisiNimi;
    }

    public void setPoisiNimi(String poisiNimi) {
        this.poisiNimi = poisiNimi;
    }

    public int getPoisiSünniaasta() {
        return poisiSünniaasta;
    }

    public void setPoisiSünniaasta(int poisiSünniaasta) {
        this.poisiSünniaasta = poisiSünniaasta;
    }

    public String getTüdrukuNimi() {
        return tüdrukuNimi;
    }

    public void setTüdrukuNimi(String tüdrukuNimi) {
        this.tüdrukuNimi = tüdrukuNimi;
    }

    public int getTüdrukuSünniaasta() {
        return tüdrukuSünniaasta;
    }

    public void setTüdrukuSünniaasta(int tüdrukuSünniaasta) {
        this.tüdrukuSünniaasta = tüdrukuSünniaasta;
    }

    public int vanemaPartneriVanus(int aasta){
        int poisiVanus = aasta - poisiSünniaasta;
        int tüdrukuVanus = aasta - tüdrukuSünniaasta;
        int vanus = poisiVanus;
        if(tüdrukuVanus > poisiVanus){
            vanus = tüdrukuVanus;
        }
        return vanus;
    }

    public boolean kasSündinudSamalAaastal(){
        return poisiSünniaasta == tüdrukuSünniaasta;
    }

    public String perenimed(){
        String perenimed;
        String [] poiss = poisiNimi.split(" ");
        String [] tüdruk = tüdrukuNimi.split(" ");
        perenimed = poiss[poiss.length - 1] + " " + tüdruk[tüdruk.length - 1];
        return perenimed;
    }

    @Override
    public String toString() {
        return "Tantsupaar: " + perenimed();
    }
}
