package KüçüktenBüyüğeSıralama;

import java.util.Scanner;

public class Sırala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;

        System.out.print("Birinci Sayıyı Girin:");
        a = input.nextInt();

        System.out.print("İkinci Sayıyı Girin:");
        b = input.nextInt();

        System.out.print("Üçüncü Sayıyı Girin");
        c = input.nextInt();
        if (a==b || a==c || b==c){
            System.out.println("Aynı sayılar girilmemelidir");
        }
        else{
            if (a<b && a<c){
                if (b<c){
                    System.out.print("Girilen sayıların küçükten büyüğe sıralaması:"+a+"<"+b+"<"+c);
                }
                else{
                    System.out.print("Girilen sayıların küçükten büyüğe sıralaması:"+a+"<"+c+"<"+b);
                }

            }
            else if (b<a && b<c){
                if (a<c){
                    System.out.print("Girilen sayıların küçükten büyüğe sıralaması:"+b+"<"+a+"<"+c);
                }
                else{
                    System.out.print("Girilen sayıların küçükten büyüğe sıralaması:"+b+"<"+c+"<"+a);
                }
            }
            else if(c<a && c<b){
                if (a<b){
                    System.out.print("Girilen sayıların küçükten büyüğe sıralaması:"+c+"<"+a+"<"+b);
                }
                else{
                    System.out.print("Girilen sayıların küçükten büyüğe sıralaması:"+c+"<"+b+"<"+a);
                }
            }
        }
    }
}