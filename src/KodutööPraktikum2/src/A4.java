/*Ühes klassis võivad olla ka samanimelised meetodid. Koostage kolm samanimelist (aga muidugi erineva signatuuriga) staatilist meetodit, mis vastavalt sellele, millist tüüpi ja kui palju on argumente, tagastaksid erinevat tüüpi väärtuse. Näiteks

kui argumentideks on kaks int-tüüpi arvu, siis tagastatakse nende summa;
kui argumentideks on üks double-tüüpi arv, siis tagastatakse selle arvu ruut, mis on ümardatud täisarvuks;
kui argumentideks on sõne ja int-tüüpi arv, siis ei tagastataks midagi, aga see sõne väljastatakse ekraanile vastav arv kordi (kasutage tsüklit).
Rakendage loodud meetodeid peameetodis. Palun kirjutage paberile/dokumenti koostatud meetodite signatuurid.
 */
public class A4 {

    //signatuur samanimeline(int,int)
    static int samanimeline(int x, int y){
        return x+y;
    }

    //signatuur samanimeline(double)
    static int samanimeline(double z){
        int taisarv = (int)Math.round(Math.pow(z,2.0));
        return taisarv;
    }

    //signatuur samanimeline(String,int)
    static void samanimeline(String b, int c){
        for (int i = 0; i < c; i++) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        System.out.println(samanimeline(3,4));
        System.out.println(samanimeline(3.5));
        samanimeline("Tere!", 5);
    }
}
