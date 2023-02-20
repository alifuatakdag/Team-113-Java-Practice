package week01;

import java.util.Scanner;

public class Calims {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

         /*
        1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
    sisteme kaydedildiğini aşağıdaki formatta yazdırın.
    *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com.tr
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
         */

        System.out.println("Lütfen Adinizi Giriniz : ");
        String Ad = scan.nextLine();
        System.out.println("Lütfen Soyadinizi Giriniz : ");
        String Soyad = scan.nextLine();
        System.out.println("Lütfen Yasinizi Giriniz : ");
        int yas = scan.nextInt();
        System.out.println("Lütfen e-mail Giriniz : ");
        String adres = scan.next();
        System.out.println("Lütfen Sifrenizi Giriniz : ");
        String pass = scan.nextLine();

        System.out.println("*****\tKAYIT BAŞARILI\t*****\n" +
                "\tAdınız: " + Ad +
                "\n\tSoyadınız: " + Soyad +
                "\n\tYaşınız: " + yas +
                "\n\tMail Adresiniz: " + adres +
                "\n\tŞifreniz: " + pass +
                "\n\tşeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");


    }
}
