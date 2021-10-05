package ManavKasa;

import java.util.Scanner;

public class Hesaplayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ArmutKgF=2.14,ElmaKgF=3.67,DomatesKgF=1.11,MuzKgF=0.95,PatlıcanKgF=5;
        double Aarmut,Aelma,Adomates,Amuz,Apatlıcan,Total=0;

        System.out.print("Kaç kilo armut aldınız:");
        Aarmut = input.nextDouble();
        System.out.print("Kaç kilo elma aldınız:");
        Aelma = input.nextDouble();
        System.out.print("Kaç kilo domates aldınız:");
        Adomates = input.nextDouble();
        System.out.print("Kaç kilo muz aldınız:");
        Amuz = input.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız:");
        Apatlıcan = input.nextDouble();

        System.out.println(Total);
        Total+=((Aarmut*ArmutKgF)+(Aelma*ElmaKgF)+(Adomates*DomatesKgF)+(Amuz*MuzKgF)+(Apatlıcan*PatlıcanKgF));
        System.out.println("Toplam Tutar:\t\t"+Total);
    }
}