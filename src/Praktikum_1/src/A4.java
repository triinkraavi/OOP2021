package Praktikum_1.src;

public class A4 {

    static int tsükkelFor(){
        int summa = 0;
        for (int i = 1; i < 6; i++) {
            summa += i;
        }
        return summa;
    }

    static int tsükkelWhile(){
        int i = 1;
        int summa = 0;
        while (i <=5){
            summa += i;
            i++;
        }
        return summa;

    }

    static int tsükkelDoWhile(){
        int i = 1;
        do{
            System.out.println("Tuletan meelde, et varsti algab loeng!");
            i++;
        }
        while (i<=5);
        return i;

    }


    public static void main(String[] args){
        for (int i = 1; i <=5; i++){
            System.out.println(i);
        }

        int summa = 6;
        int piir = 31;
        while (summa < piir){
            summa += 2;

        }
        System.out.println(summa);


        System.out.println(tsükkelFor());
        System.out.println(tsükkelWhile());
        System.out.println(tsükkelDoWhile());
    }
}
