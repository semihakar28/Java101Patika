import java.util.Scanner;

public class PalindromSayı {

    static void isPolindrom(int num){
        int temp = num,reserveNum = 0,lastNum;
        while (temp !=0){
            lastNum = temp % 10;
            reserveNum = (reserveNum*10)+lastNum;
            temp/=10;
        }
        if (num == reserveNum){
            System.out.println("Girilen Sayı Palindrom Bir Sayıdır.");
        }
        else{
            System.out.println("Girilen Sayı Palindrom Sayısı değildir.");
        }

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Bir sayı giriniz:");
        number = input.nextInt();
        isPolindrom(number);
    }
}