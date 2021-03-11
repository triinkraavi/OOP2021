/*
Koostage programm, mis saab käsurealt inimese eesnime, kehamassi (kilogrammides, täisarvuna) ja pikkuse (meetrites,
reaalarvuna) ning arvutaks tema kehamassiindeksi ning annaks vastavalt tulemusele vähemalt kolme sorti soovitusi
(näiteks, "Söö rohkem", "Kasva pikemaks" jms.)

Kirjutage paberile/dokumenti, millised on käsurealt lugemise ja eelmises praktikumis käsitletud klaviatuurilt
sisestamise põhilised erinevused. Milliste programmide puhul võiks neid rakendada?

Käsurealt lugemisel on kõik argumendid Stringidena, klaviatuurilt lugemisel peab ette defineerima, mis tüüpi sisestatud
andmed on. Eelised käsurealt sisestamisel on see et nii on hea mingit lihtsat programmi kiiresti katsetada, samuti ei
pea olema eraldi programmi, millega Java faile lahti teha.
 */

public class A72 {

    public static void main(String[] args){

        String nimi = args[0];
        String kaal = args[1];
        String pikkus = args[2];
        double bmi = Double.parseDouble(kaal)/Math.pow((Double.parseDouble(pikkus)), 2);
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
