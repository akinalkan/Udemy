package ders48_ArmstrongSayisi;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        /*
        Girilen bir sayının armstrong sayısını olup olmadığını bulmaya çalışın.
        Örneğin, 4 basamaklı bir sayının armstrong sayısı olması için şu şartı sağlaması gerekmektedir.
        1634 = 1^4 + 6^4 + 3^4 + 4^4 (Buradaki 4 basamak sayısı)
        371 = 3^3 + 7^3 + 1^3 (Buradaki 3 basamak sayısı)

        Bu programı do while döngüsü yardımıyla yapabilirsiniz.
        */
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayiyi giriniz : ");
        int sayi= scan.nextInt();
        int ilkSayi=sayi;
        int basamakSayisi=0;
        while (sayi>0){
            sayi/=10;
            basamakSayisi++;
        }
        System.out.println("sayi = " + ilkSayi+"'nin basamak sayisi : "+basamakSayisi);
        int toplam=0;
        sayi=ilkSayi;


        do{
            int basamakDegeri=sayi%10;
            toplam+=Math.pow(basamakDegeri,basamakSayisi);
            sayi/=10;


        }while (sayi>0);
        if(toplam==ilkSayi){
            System.out.println(ilkSayi+" Armstrong sayisidir");
        }else System.out.println("Sayi armstrong sayisi degildir");
    }
}
