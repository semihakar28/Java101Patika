package DaireAlan;

import java.util.Scanner;

public class Hesaplayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double yarıcap,açı,pi=3.14,alan;

        System.out.print("Dairenin yarıçapını giriniz:");
        yarıcap = input.nextDouble();

        System.out.print("Daire diliminin açısını giriniz:");
        açı = input.nextDouble();

        alan = (pi*(yarıcap*yarıcap)*açı)/360;

        System.out.println("Daire diliminin alanı = \t\t"+alan);

    }
}