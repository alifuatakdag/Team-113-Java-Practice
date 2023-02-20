package week02;

import java.util.Scanner;

public class P02_DataCasting {
    public static void main(String[] args) {

    /*
2- Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
    Girdiğiniz harf :
    Girdiğiniz harften sonraki  3 harf :
şeklinde yazdrın.
ipucu: char
 */


        Scanner scan = new Scanner(System.in);
//
        // System.out.println("Lütfen bir harf giriniz: ");
//
        // char harf = scan.next().charAt(0);
//
        // System.out.println("Girdiğiniz harf: "+ harf);
//
//
//
        // System.out.println("Girdiğiniz harften sonraki  3 harf : " + (char)(harf+1)+", "+
        //         (char)(harf+2)+", "+(char)(harf+3));


        ///*
        //3- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıa bölün ve
        //sonucu tam sayı yazdırın
        //ipucu: sorumluluk bende
        // */


       //System.out.println("iki sayı giriniz: ");
       //double sayi1 = scan.nextDouble();
       //double sayi2 = scan.nextDouble();
       //int bolum= (int)(sayi1/sayi2);
       //System.out.println(bolum);

        ///*
        //1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //Ornek:  gun=Pazar output = "Hafta sonu"  gun=Sali output = "Hafta ici"
        //*** String icin equals method'unusalı kullanin
        // */

        System.out.println("Lütfen bir gün giriniz: ");
        String gun = scan.nextLine().toLowerCase();
        if (gun.equals("cumartesi")||gun.equals("pazar")){
            System.out.println("Hafta Sonu");
        }
        if (gun.equals("pazartesi")||gun.equals("salı")||gun.equals("carsamba")||gun.equals("persembe")
                ||gun.equals("cuma")){
            System.out.println("Hafta Ici");
        }







    }
}
