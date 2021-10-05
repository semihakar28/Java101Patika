package KdvHesaplama;

import java.util.Scanner;
public class Hesaplayıcı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double tutar, kdvOran = 0.18,kdvTutar,kdvliTutar;
        System.out.print("Alışveriş Tutarını Giriniz: ");
        tutar = inp.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("Tutar:\t" + tutar);
        System.out.println("Kdv Oranı:\t" + kdvOran);
        System.out.println("Kdv Tutarı:\t" + kdvTutar);
        System.out.println("Kdv\'li Tutar :\t" + kdvliTutar);



    }
}
