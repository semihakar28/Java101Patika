package VucutKitleEndeks;

import java.util.Scanner;

public class Hesaplayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,kilo,indeks;

        System.out.print("Boyunuzu metre cinsinden giriniz:");
        boy = input.nextDouble();
        System.out.print("Kilonuzu giriniz:");
        kilo = input.nextDouble();

        indeks = kilo/(boy*boy);
        System.out.println("Vucut Kitle İndeksiniz :\t\t"+indeks);
    }
}