package UcgenAlanHesaplama;

import java.util.Scanner;

public class Hesaplayıcı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double aKenarı,bKenarı,cKenarı,u,alan;

        System.out.print("A kenarının uzunluğunu giriniz:");
        aKenarı = input.nextDouble();

        System.out.print("B kenarının uzunluğunu giriniz:");
        bKenarı = input.nextDouble();

        System.out.print("C kenarının uzunluğunu giriniz:");
        cKenarı = input.nextDouble();

        u = (aKenarı+bKenarı+cKenarı)/2;

        alan = u *(u-aKenarı)*(u-bKenarı)*(u-cKenarı);

        System.out.println("Üçgenin Çevresi =\t"+u*2);
        System.out.println("Üçgenin Alanı =\t\t"+Math.sqrt(alan));

    }
}