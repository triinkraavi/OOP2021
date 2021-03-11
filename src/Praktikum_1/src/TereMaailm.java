package Praktikum_1.src;

public class TereMaailm {
    static int liidaVõiKorruta(int n, int a, int b) {
        if (n == 0) {
            return a + b;
        } else {
            return a * b;
        }
    }
    static int suuremSumma(int arv1, int arv2){
        int summa = 0;
        if(arv1 > arv2){
            return 0;
        }
        int arv = arv1;
        while (arv <= arv2){
            summa += arv;
            arv++;
        }
        return summa;
    }

    static int suuremSummaDoWhile(int arv1, int arv2){
        int summa = 0;
        if(arv1 > arv2){
            return 0;
        }
        int arv = arv1;
        do {
            summa += arv;
            arv++;
        }
        while (arv <= arv2);
        return summa;
    }

    static int suuremSummaFor(int arv1, int arv2){
        if (arv1 > arv2){
            return 0;
        }
        int summa = 0;
        for (int i = arv1; i <= arv2; i++){
            summa += i;
        }
        return summa;
    }


        public static void main (String[]args){
            //System.out.println("Tere maailm!");
            int a;
            a = 5;
            int b = 10;
            //System.out.println("a = " + a + " b = " + b);
            //System.out.println(a + b);
            //System.out.println(a + " " + b);
            double d = 2.15;
            int summa = liidaVõiKorruta(0, 2, 3);
            System.out.println("Summa = " + summa);
            int korrutis = liidaVõiKorruta(1, 2, 3);
            System.out.println("Korrutis = " + korrutis);
            System.out.println(suuremSumma(2, 4));
            System.out.println(suuremSummaDoWhile(2,4));
            System.out.println(suuremSummaFor(2,4));
        }
    }
