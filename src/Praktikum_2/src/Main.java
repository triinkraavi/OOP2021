package Praktikum_2.src;

import java.util.Arrays;

public class Main {

    static int[] massiividuheks(int[] massiiv1, int[] massiiv2){
        int[] suur = new int[massiiv1.length + massiiv2.length];
        for (int i = 0; i < massiiv1.length; i++) {
            suur[i] = massiiv1[i];

        }
        System.out.println(Arrays.toString(suur));

        for (int i = massiiv1.length; i < suur.length; i++) {
            suur[i] = massiiv2[i- massiiv1.length];

        }
        System.out.println("Enne sorteerimist: " + Arrays.toString(suur));
        Arrays.sort(suur);
        System.out.println("Pärast sorteerimist: " + Arrays.toString(suur));

        return suur;
    }

    //Massiivi ümberpööramine
    static int[] ümberpööratud(int[] algne){
        int[] valjund = new int[algne.length];
        int lugeja = 0;
        for (int i = algne.length-1; i >= 0; i--) {
            valjund[lugeja] =algne[i];
            lugeja++;

        }
        return valjund;
    }

    public static void main(String[] args) {
        /*
        String[] nimed = {"Mart", "Teet", "Jaan"};
        int[] esimesed = {1, 2, 3, 4};
        int[] teised = {5, 6, 7, 8, 9, 10, 11};
        //System.out.println(Arrays.toString(nimed));
        int[] koos = massiividuheks(teised, esimesed);
        System.out.println("Algne massiiv on: " + Arrays.toString(koos));
        int[] tagurpidi = ümberpööratud(koos);
        System.out.println("Pärast massiiv on: " + Arrays.toString(tagurpidi));
        */

        int[] poisid = {180, 175, 200, 172, 169, 183, 188};
        int[] tüdrukud = {165, 167, 172, 169};

        paaridesse(poisid,tüdrukud);

    }

    static String[] paaridesse(int[] poisid, int[] tüdrukud){
        java.util.Arrays.sort(poisid);
        java.util.Arrays.sort(tüdrukud);
        boolean tüdrukuid_on_rohkem = true;
        int pikkus = poisid.length;
        if(poisid.length > tüdrukud.length){
            pikkus = tüdrukud.length;
            tüdrukuid_on_rohkem = false;
        }

        String[] paarid = new String[pikkus];
        int i = 0;
        while (true){
            paarid[i] = String.valueOf(poisid[i]) + " ja " + String.valueOf(tüdrukud[i]);
            i++;
            if(i>=pikkus){
                break;
            }
        }
        System.out.println(Arrays.toString(paarid));
        if(tüdrukuid_on_rohkem){
            int[] ülejäänud = new int[tüdrukud.length- poisid.length];
            int v = 0;
            for (int j = poisid.length; j < tüdrukud.length; j++) {
                ülejäänud[v] = tüdrukud[j];
                v++;
            }
            System.out.println("Paariliseta jäid tüdrukud, kelle pikkusteks on: " + Arrays.toString(ülejäänud));
        }
        else{
            int[] ülejäänud = new int[poisid.length- tüdrukud.length];
            int v = 0;
            for (int j = tüdrukud.length; j < poisid.length; j++) {
                ülejäänud[v] = poisid[j];
                v++;
            }
            System.out.println("Paariliseta jäid poisid, kelle pikkusteks on: " + Arrays.toString(ülejäänud));

        }

        return null;
    }
}
