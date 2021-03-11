package Praktikum_1.src;

import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta esimese külje pikkus: ");
        double külg1 = scan.nextDouble();
        System.out.println("Sisesta teise külje pikkus: ");
        double külg2 = scan.nextDouble();
        System.out.println("Sisesta kolmanda külje pikkus: ");
        double külg3 = scan.nextDouble();
        if (külg1+külg2 > külg3 && külg1+külg3 > külg2 && külg2+külg3>külg1){
            System.out.println("Küljed on kolmnurga külgedeks");
        }
        else{
            System.out.println("Küljed ei saa olla kolmnurga külgedeks");
        }
    }

}
