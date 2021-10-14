package UcakBileti;

import java.util.Scanner;

public class Hesaplayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age,km,vote;
        double calculator,perKm=0.1,price;

        System.out.print("Mesafeyi km cinsinden yazınız:");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz:");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz(1 => Tek yön  2 => Gidiş-Dönüş):");
        vote = input.nextInt();

        if (km<1){
            System.out.print("Hatalı veri girdiniz!");
        }
        else{
            if (age<0){
                System.out.print("Hatalı veri girdiniz!");
            }
            else{
                calculator = km* perKm;
                switch (vote){
                    case 1:
                        if (age<=11){
                            price=calculator*0.5;
                            System.out.print("Toplam Tutar = "+price);
                        }
                        else if(age>=12 && age<=24){
                            price=calculator*0.9;
                            System.out.print("Toplam Tutar = "+price);
                        }
                        else if (age>65){
                            price =  calculator*0.7;
                            System.out.print("Toplam Tutar = "+price);
                        }
                        else{
                            System.out.print("Toplam Tutar = "+calculator);
                        }
                        break;
                    case 2:
                        if (age<=11){
                            price=calculator*0.8;
                            System.out.print("Toplam Tutar = "+price);
                        }
                        else if(age>=12 && age<=24){
                            price=((calculator*2)*0.8)*0.9;
                            System.out.print("Toplam Tutar = "+price);
                        }
                        else if (age>65){
                            price =  ((calculator*2)*0.8)*0.7;
                            System.out.print("Toplam Tutar = "+price);
                        }
                        else{
                            price = (calculator*2)*0.8;
                            System.out.print("Toplam Tutar = "+price);
                        }
                        break;

                }
            }
        }

    }
}