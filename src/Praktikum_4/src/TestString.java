public class TestString {
    public static void main(String[] args) {
        String nimi = "Mart Mardikas";

        /*
        System.out.println("Sõne pikkus on: " + nimi.length()); // 13
        System.out.println(nimi.startsWith("Mart")); // true
        System.out.println(nimi.endsWith("kas")); // true
        System.out.println(nimi.endsWith("Mart")); // false
        System.out.println("'a' esimene positsioon: " +
                nimi.indexOf('a')); // 1

        int rIndex = nimi.indexOf('r');
        System.out.println("'r' esimene positsioon: " + rIndex); // 2
        System.out.println("'r' jargmine positsioon: " +
                nimi.indexOf('r', rIndex + 1)); // 7

        int aIndex = nimi.lastIndexOf('a');
        System.out.println("'a' viimane positsioon: " + aIndex); // 11
        System.out.println("Alamsõne \"Mardi\" algus: " +
                nimi.indexOf("Mardi")); // 5
        System.out.println("4. täht on "+nimi.charAt(3)); // 't'

        //Täpne võrdsuse kontroll:
        System.out.println(nimi.equals("Mart Mardikas")); // true
        System.out.println(nimi.equals("mart mardikas")); // false

        //Suuri-väikesi tähti mitteeristav võrdsuse kontroll:
        System.out.println(nimi.equalsIgnoreCase("mart mardikas"));  // true

        //Leksikograafiline võrdlemine:
        System.out.println(nimi.compareTo("Jaan Jaaniste")); // >0
        System.out.println(nimi.compareTo("Peeter Paan")); // <0
        System.out.println(nimi.compareTo("Mart Mardikas")); // =0

        System.out.println(nimi.replace('M', 'P')); // "Part Pardikas"
        System.out.println(nimi.toUpperCase()); // "MART MARDIKAS"

        //Sõne ilma alguses ja lõpus olevate tühikute ja reavahetusteta
        String imelik = " Mart \n";
        System.out.println(imelik.trim()); // "Mart"

        System.out.println("\"Harry Potter ja 'saladuste' kamber\"");

         */

        String[] tükid = nimi.split("ar");
        for (int i = 0; i < tükid.length; i++) {
            System.out.println(tükid[i]);
        }

        char[] sümboliteMassiiv = {'T', 'e', 'r', 'e'};
        String teade1 = new String(sümboliteMassiiv);
        String teade2 = "Tere";
        String teade3 = "Tere";

        System.out.println(teade1.equals(teade2));
        System.out.println(teade2.equals(teade3));
        System.out.println(teade1 == teade2);
        System.out.println(teade2 == teade3);

        int[] arvud = {3, 5, 7, 11};
        //ajutiselt peidetud, et alt töötaks
        //StringBuilder sb = new StringBuilder(50);
        /* Sama tulemus, nagu allpool
        sb.append("esimesed algarvud on ");
        for (int arv :arvud) {
            sb.append(arv);
            sb.append(' ');
            
        }
        String tulemus = sb.toString();
        System.out.println(tulemus);

         */
        String tulemus = "esimesed algarvud on ";
        for (int arv:arvud) {
            tulemus = tulemus + arv + ' ';
            
        }
        System.out.println(tulemus);

        StringBuilder sb = new StringBuilder("esimesed algarvud on 3 5 7 11");
        int i = sb.indexOf(" ", "esimesed algarvud on ".length()); // tühik pärast “3”
        while (i != -1) {
            sb.replace(i, i + 1, ",");
            i = sb.indexOf(" ", i + 1);
        }
        System.out.println(sb); // “esimesed algarvud on 3,5,7,11”

// Mähisklassid



        }


    }


