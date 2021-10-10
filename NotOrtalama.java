package NotHesaplama;

import java.util.Scanner;

public class Hesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fiz,tur,kim,biy,ing,dersSayısı=6;
        double ortalama;
        System.out.print("Matematik notunuzu giriniz:");
        mat = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz:");
        tur = input.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        fiz = input.nextInt();
        System.out.print("Kimya notunuzu giriniz");
        kim = input.nextInt();
        System.out.print("Biyoloji notunuzu giriniz:");
        biy = input.nextInt();
        System.out.print("İngilizce notunuzu giriniz:");
        ing = input.nextInt();

        int [] notlar = new int[6];
        notlar[0]=mat;
        notlar[1]=fiz;
        notlar[2]=tur;
        notlar[3]=kim;
        notlar[4]=biy;
        notlar[5]=ing;

        int toplam=0;
        for (int nots:notlar){
            if (nots>=0 && nots<=100){
                toplam+=nots;
            }
            else{
                System.out.println("Not ortalamaya katılmamıştır");
            }
        }
        ortalama = toplam/dersSayısı;
        System.out.println("Ortalamanız:"+ortalama);
        if (ortalama>=55){
            System.out.println("Sınıfı geçtiniz");
        }
        else{
            System.out.println("Sınıfta kaldınız");
        }
    }
}
