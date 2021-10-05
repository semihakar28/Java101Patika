package Taksimetre;

import java.util.Scanner;

public class Hesaplayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double aUcreti =10,perKm=2.20,Minödeme=20,ücret,ödenecekTutar;
        int Km;

        System.out.print("Gidilen mesafeyi Km cinsinden yazınız:");
        Km = input.nextInt();

        ücret = (Km*perKm)+aUcreti;

        boolean kosul = ücret<Minödeme;
        ödenecekTutar = kosul ? Minödeme : ücret;

        System.out.println("Ödenecek Ücret =\t\t"+ödenecekTutar+"TL");

    }
}