import java.util.Scanner;

/*
Koostage programm, mis saab käsurealt inimese eesnime, kehamassi (kilogrammides, täisarvuna) ja pikkuse (meetrites,
reaalarvuna) ning arvutaks tema kehamassiindeksi ning annaks vastavalt tulemusele vähemalt kolme sorti soovitusi
(näiteks, "Söö rohkem", "Kasva pikemaks" jms.)

Kirjutage paberile/dokumenti, millised on käsurealt lugemise ja eelmises praktikumis käsitletud klaviatuurilt
sisestamise põhilised erinevused. Milliste programmide puhul võiks neid rakendada?
 */
public class A7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta oma eesnimi: ");
        String nimi = scan.next();
        System.out.println("Sisesta oma kaal kilogrammides, täisarvuna: ");
        int kaal = scan.nextInt();
        System.out.println("Sisesta oma pikkus meetrites, reaalarvuna: ");
        double pikkus = scan.nextDouble();
        double uuskaal = (double) kaal;
        double bmi = uuskaal/Math.pow(pikkus, 2.0);
        System.out.println("Kehamassiindeks on: " + bmi);
        if (bmi <= 18.5){
            System.out.println("Söö rohkem!");
        }
        else if (bmi > 18.5 && bmi < 40.0) {
            System.out.println("Hoia vormi!");
        }
        else{
            System.out.println("Võta alla!");
        }
    }

    }

