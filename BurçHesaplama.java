package BurçHesaplama;

import java.util.Scanner;

public class Burçhesaplama {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int day,month;

         System.out.print("Doğum gününüzü giriniz:");
         day = input.nextInt();
         System.out.print("Doğum ayınızı giriniz(ocak = 1):");
         month = input.nextInt();

         if (month>12){
             System.out.print("12 den fazla ay yoktur");
         }
         else{
             if (day>31){
                 System.out.print("31 günden uzun ay yoktur");
             }
             else{
                 switch (month){
                     case 1:
                         if (day<=21){
                             System.out.print("Burcunuz:Oğlak");
                             break;
                         }
                         else{
                             System.out.print("Burcunuz:Kova");
                             break;
                         }
                     case 2:
                         if (day<=19){
                             System.out.print("Burcunuz:Kova");
                             break;
                         }
                         else if(day>=20 && day<=28){
                            System.out.print("Burcunuz:Balık");
                             break;
                         }
                         else{
                             System.out.print("Şubat ayı 28 gündür");
                             break;
                         }
                     case 3:
                         if (day<=20){
                             System.out.print("Burcunuz:Balık");
                             break;
                         }
                         else{
                             System.out.print("Burcunuz:Koç");
                             break;
                         }
                     case 4:
                         if (day<=20){
                             System.out.print("Burcunuz:Koç");
                             break;
                         }
                         else if (day == 31){
                             System.out.print("Nisan ayı 30 gündür");
                             break;
                         }
                         else{
                             System.out.print("Burcunuz:Boğa");
                             break;
                         }
                     case 5:
                         if (day<=21){
                             System.out.print("Burcunuz:Boğa");
                             break;
                         }
                         else{
                             System.out.print("Burcunuz:İkizler");
                             break;
                         }
                     case 6:
                         if (day<=22){
                             System.out.print("Burcunuz:İkizler");
                             break;
                         }
                         else if (day == 31){
                             System.out.print("Haziran ayı 30 gündür");
                             break;
                         }
                         else{
                            System.out.print("Burcunuz:Yengeç");
                             break;
                         }
                     case 7:
                         if (day<=22){
                             System.out.print("Burcunuz:Yengeç");
                             break;
                         }
                         else {
                             System.out.print("Burcunuz:Aslan");
                             break;
                         }
                     case 8:
                         if (day<=22){
                             System.out.print("Burcunuz:Aslan");
                             break;
                         }
                         else{
                             System.out.print("Burcunuz:Başak");
                             break;
                         }
                     case 9:
                         if (day<=22){
                             System.out.print("Burcunuz:Başak");
                             break;
                         }
                         else if(day==31){
                             System.out.print("Eylül ayı 30 gündür");
                             break;
                         }
                         else{
                             System.out.print("Burcunuz:Terazi");
                             break;
                         }
                     case 10:
                         if (day<=22){
                             System.out.print("Burcunuz:Terazi");
                             break;
                         }
                         else{
                             System.out.print("Burcunuz:Akrep");
                             break;
                         }

                     case 11:
                         if (day<=21){
                             System.out.print("Burcunuz:Akrep");
                             break;
                         }
                         else if(day==31){
                             System.out.print("Kasım ayı 30 gündür");
                             break;
                         }
                         else {
                             System.out.print("Burcunuz:Yay");
                             break;
                         }
                     case 12:
                         if (day<=21){
                             System.out.print("Burcunuz:Yay");
                             break;
                         }
                         else {
                             System.out.print("Burcunuz:Oğlak");
                             break;
                         }
                 }
             }
         }
    }
}
