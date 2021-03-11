import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class TekstiTest {
    public static void main(String[] args) throws Exception {
        File fail = new File("c:/temp/marsruut.txt");

        if (fail.exists())
            System.out.println("Fail on juba olemas");
        else
            System.out.println("Faili ei ole olemas");

        try (PrintWriter pw = new PrintWriter(fail, "UTF-8")) {
            pw.print("Karl Ernst von Baeri ");
            pw.println("tänav");
            pw.print("Johann Wilhelm Friedrich Hezeli ");
            pw.println("tänav");
            pw.print("Juhan Liivi ");
            pw.println("tänav");
        }

        try (Scanner sc = new Scanner(fail, "UTF-8")){
            while(sc.hasNextLine()){
                String rida = sc.nextLine();
                String []  tükid = rida.split(" ");
                System.out.println(tükid[tükid.length-2]+ " " + tükid[tükid.length-1]);
                System.out.println();
            }

        }
    }

}
