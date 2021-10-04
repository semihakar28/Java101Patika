package NotOrtalaması;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // Değişkenler
        int mat,tur,fiz,kim,biy;
        // Ders Ağırlıkları
        int mata = 5,tura=3,fiza=5,kima=3,biya=3;

        // Notları alma
        System.out.print("Matematik sınav notunuzu giriniz:");
        mat = inp.nextInt();

        System.out.print("Türkçe sınav notunuzu giriniz:");
        tur = inp.nextInt();

        System.out.print("Fizik sınav notunuzu giriniz:");
        fiz = inp.nextInt();

        System.out.print("Kimya sınav notunuzu giriniz:");
        kim = inp.nextInt();

        System.out.print("Biyoloji sınav notunuzu giriniz:");
        biy = inp.nextInt();

        // Hesaplama
        double orthesapla = ((mat*mata)+(tur*tura)+(fiz*fiza)+(kim*kima)+(biy*biya));
        int kstoplam = (mata+tura+fiza+kima+biya);
        double ortalama = (orthesapla/kstoplam);

        System.out.print("Not Ortalamanız=\t"+ortalama);




    }

}
