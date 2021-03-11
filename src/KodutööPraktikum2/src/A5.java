/*Veepargi erinevatele atraktsioonidele lastakse lapsi vastavalt kasvule. Kõige väiksemad (60-100 cm) lapsed saavad
minna väikelaste atraktsioonidele. Keskmised lapsed (101-140 cm) saavad minna lasteatraktsioonidele. Suuremad lapsed
(141-200 cm) saavad minna täiskasvanute atraktsioonidele.
 */

import java.util.Arrays;

public class A5 {

    /*Koostage meetod, mille argumentideks oleksid pikkuse alumine ja ülemine piir ja mis tagastaks juhuslikult genereeritud
täisarvu antud vahemikust. Kasutage juhuarvu genereerimisel ja ümardamisel klassi Math vastavaid meetodeid.
 */
    static int juhuslikNumber(int alumine, int ülemine){
        return (int)Math.round(Math.random()*(ülemine-alumine)+alumine);
    }

    /* Koostage meetod, mille argumentideks oleksid laste arv, pikkuste alumine ja ülemine piir. Looge meetodis massiiviloome
abil täisarvude massiiv, mis sisaldab laste pikkusi, mis on juhuslikult genereeritud kasutades eelmist meetodit.
Meetodi tagastustüüp peaks olema int[].
     */

    static int[] arvJaPikkused (int lasteArv, int alumine, int ülemine){
        int[] a = new int[lasteArv];
        for (int i = 0; i < lasteArv; i++) {
            a[i] = juhuslikNumber(alumine,ülemine);
        }
        return a;

    }

    /*Koostage meetod, mis leiab laste pikkuste harmoonilise keskmise. Formaalseks parameetriks on siis täisarvude massiiv.
Rakendage seda meetodit. (Harmooniline keskmine on aritmeetilisest ja geomeetrilisest keskmisest vähem tuntud, aga
mitmetel juhtudel siiski väga kasulik (näiteks keskmise kiiruse arvutamisel, kui võrdne teepikkus läbitakse erinevate
ühtlaste kiirustega). Käesolevas pikkuste näites on see küll pigem kunstlik.)
Paberile/dokumenti kirjutada harmoonilise keskmise definitsioon ja koht, kust te selle leidsite.

Harmooniline keskmine on nullist erinevate suuruste a1, a2, ..., an pöördväärtuste aritmeetilise keskmise pöördväärtus.
Leitud kohast: https://et.wikipedia.org/wiki/Harmooniline_keskmine
*/

    static double harmoonilineKeskmine(int[] massiiv){
        double summa = 0;
        for (int i = 0; i < massiiv.length; i++) {
            summa += 1/(double)massiiv[i];
        }
        return massiiv.length/summa;

    }

    /*
Viimast meetodit peameetodis rakendades luua 10-liikmeline massiiv väiksemate laste jaoks, 15-liikmeline massiiv
keskmiste laste jaoks ja 20-liikmeline massiiv suuremate laste jaoks.
Väljastage peameetodis eraldi tsüklite abil ekraanile iga massiivi kõik elemendid. Seejärel väljastada tsükli ja
valikulause (if) abil ainult need esimese massiivi elemendid, mille väärtus on üle 80. Katsetage mõlemat for-tsükli
versiooni.
 */
    public static void main(String[] args) {

        int[] väiksemad = arvJaPikkused(10, 60, 100);
        System.out.println("Väiksemate laste massiiv: " + Arrays.toString(väiksemad));

        System.out.println("Väiksemate laste massiivi elemendid:");

        for (int elem : väiksemad){
            System.out.println(elem);
        }
        System.out.println("Väiksemate laste massiivi elemendid, mille väärtus on üle 80 (versioon 1):");
        for (int i = 0; i < väiksemad.length; i++) {
            if (väiksemad[i] > 80){
                System.out.println(väiksemad[i]);
            }

        }
        System.out.println("Väiksemate laste massiivi elemendid, mille väärtus on üle 80 (versioon 2):");
        for (int elem : väiksemad){
            if (elem > 80){
                System.out.println(elem);
            }
        }

        int[] keskmised = arvJaPikkused(15, 101, 140);
        System.out.println("Keskmiste laste massiiv: " + Arrays.toString(keskmised));
        System.out.println("Keskmiste laste massiivi elemendid:");
        for (int elem : keskmised){
            System.out.println(elem);
        }

        int[] suuremad = arvJaPikkused(20, 141, 200);
        System.out.println("Suuremate laste massiiv: " + Arrays.toString(suuremad));
        System.out.println("Suuremate laste massiivi elemendid:");
        for (int elem : suuremad){
            System.out.println(elem);
        }

        System.out.println("Väiksemate laste harmooniline keskmine: " + harmoonilineKeskmine(väiksemad));
        System.out.println("Keskmiste laste harmooniline keskmine: " + harmoonilineKeskmine(keskmised));
        System.out.println("Suuremate laste harmooniline keskmine: " + harmoonilineKeskmine(suuremad));
    }
}
