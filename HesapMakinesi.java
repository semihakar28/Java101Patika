package HesapMakinesi;

import java.util.Scanner;

public class Hesaplayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1,num2,calculator;
        String islem;
        System.out.println("Hesap Makinesine Hoş Geldiniz");
        System.out.print("Toplama işlemi için '+'\nÇıkartma işlemi için '-'\nÇarpma işlemi için '*'\nBölme işlemi için'/'\nYapmak İstediğiniz işlemi giriniz:");
        islem=input.nextLine();
        System.out.print("İlk Sayıyı Giriniz:");
        num1= input.nextDouble();
        System.out.print("İkinci Sayıyı Giriniz:");
        num2= input.nextDouble();

        switch (islem){
            case "+":
                calculator=num1+num2;
                System.out.print(num1+"+"+num2+"="+calculator);
                break;
            case "-":
                calculator=num1-num2;
                System.out.print(num1+"-"+num2+"="+calculator);
                break;
            case "*":
                calculator=num1*num2;
                System.out.print(num1+"*"+num2+"="+calculator);
                break;
            case "/":
                calculator=num1/num2;
                System.out.print(num1+"/"+num2+"="+calculator);
                break;
            default:
                System.out.print("Hatalı giriş yaptınız.Tekrar Deneyiniz.");
                break;
        }
    }
}
