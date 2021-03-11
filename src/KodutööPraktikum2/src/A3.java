/*Proovige erinevate klassi Math meetodite tööd. Proovige mõnda ühe ja mõnda kahe argumendiga meetodit.
Proovige ka kasutada väärtusi e ja π. Proovige ja tutvuge ka vähemalt ühe sellise funktsiooniga, millest te varem
kuulnud pole. Palun kirjutage paberile/dokumenti, mis meetoditega tutvusite ja mida teeb teile seni võõras olnud
funktsioon.
 */

public class A3 {


    public static void main(String[] args) {
        double x = 5.8;
        double y = -1.3;
        //Math.nextAfter prindib välja numbri, mis on esimese argumendi kõrval suunaga teise argumendi poole
        System.out.println("Arvu " + x + " järgmine arv suunaga arvu " + y + " poole on: " + Math.nextAfter(x, y));
        //Math.nextUp on sarnane nextAfteriga, see väljastab argumendist järgmise numbri positiivses suunas
        System.out.println("Arvu " + x + " järgmine arv positiivses suunas on: " + Math.nextUp(x));
        // väärtusele e liidetakse esimene argument
        System.out.println("Arvu " + Math.E + " ja arvu "+ x + " summa on: " + (Math.E + x));
        // Ringi ümbermõõdu arvutamine, kui raadius on x
        System.out.println("Ringi, mille raadius on " + x + ", ümbermõõt on: " + (2*Math.PI*x));
    }

}
