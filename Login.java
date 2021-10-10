package Login;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,password,newPassword;
        int vote;


        System.out.print("Kullanıcı Adınızı Giriniz:");
        userName = input.nextLine();
        System.out.print("Şifrenizi Giriniz:");
        password = input.nextLine();

        if (userName.equals("Semihakar") && password.equals("123456")){
            System.out.print("Sisteme Giriş Yaptınız.");
        }
        else{
            System.out.print("Hatalı giriş yaptınız.\nYeni şifre oluşturmak için 1'i\nÇıkış Yapmak için 2'yi kullanınız\n");
            vote = input.nextInt();
            switch (vote){
                case 1:
                    System.out.print("Yeni şifrenizi giriniz:");
                    newPassword = input.next();
                    System.out.println(newPassword);
                    if (newPassword == password){
                        System.out.print("Yeni şifreniz ile eski şifreniz aynı olamaz.");
                    }
                    else{
                        System.out.print("Yeni şifreniz oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.print("Çıkış Yapılıyor...");
                    break;
                default:
                    System.out.print("Hatalı işlem yaptınız.");
                    break;
            }

        }
    }
}
