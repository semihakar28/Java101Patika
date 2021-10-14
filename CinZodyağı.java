package CinZodyagı;

import java.util.Scanner;

public class Hesaplayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year,zodyak;

        System.out.print("Doğum Yılınızı Giriniz:");
        year = input.nextInt();

        zodyak = year % 12;

        switch (zodyak){
            case 0:
                System.out.print("Çin Zodyağına göre burcunuz: Maymun");
                break;
            case 1:
                System.out.print("Çin Zodyağına göre burcunuz: Horoz");
                break;
            case 2:
                System.out.print("Çin Zodyağına göre burcunuz: Köpek");
                break;
            case 3:
                System.out.print("Çin Zodyağına göre burcunuz: Domuz");
                break;
            case 4:
                System.out.print("Çin Zodyağına göre burcunuz: Fare");
                break;
            case 5:
                System.out.print("Çin Zodyağına göre burcunuz: Öküz");
                break;
            case 6:
                System.out.print("Çin Zodyağına göre burcunuz: Kaplan");
                break;
            case 7:
                System.out.print("Çin Zodyağına göre burcunuz: Tavşan");
                break;
            case 8:
                System.out.print("Çin Zodyağına göre burcunuz: Ejdarha");
                break;
            case 9:
                System.out.print("Çin Zodyağına göre burcunuz: Yılan");
                break;
            case 10:
                System.out.print("Çin Zodyağına göre burcunuz: At");
                break;
            case 11:
                System.out.print("Çin Zodyağına göre burcunuz: Koyun");
                break;
            default:
                break;
        }


    }
}