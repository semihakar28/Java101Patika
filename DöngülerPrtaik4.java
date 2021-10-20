package Döngüler;

import java.util.Scanner;

public class Pratik4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num,üs,xnum;

        System.out.print("Üssü alınacak sayıyı giriniz:");
        num = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz:");
        üs = input.nextInt();
        xnum=num;
        for (int i = 1; i<üs;i++){
            xnum*=num;
        }
        System.out.print(xnum);
    }
}
