package Döngüler;

import java.util.Scanner;

public class Diamonds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,c=1;
        System.out.print("Bir n değeri giriniz:");
        n = input.nextInt();

        for (int i = 1; i<n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int y=1;y<=(i*2)-1;y++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=n-2;i>=0;i--){

            for (int x = 0;x<=c;x++){
                System.out.print(" ");
            }
            for (int y=2*i-1;y>0;y--){
                System.out.print("*");
            }
            System.out.println();
            c++;
        }

    }
}


