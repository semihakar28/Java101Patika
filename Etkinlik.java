package Etkinlik;

import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        int derece;
        Scanner input = new Scanner(System.in);
        System.out.print("Derece Giriniz:");
        derece = input.nextInt();

        if(derece<5){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }else if(derece>=5 && derece<=25){
            if (derece<=15){
                System.out.println("Sinemaya gidebilirsiniz");
            }
            if (derece>=10){
                System.out.println("Pikniğe gidebilirsiniz");
            }
        }
        else{
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}