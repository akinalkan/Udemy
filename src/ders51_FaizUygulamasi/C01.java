package ders51_FaizUygulamasi;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        /*
        Faiz Uygulaması
        Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği
        bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın.

        Faiz Oranı : %6 Faiz Oranı

        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bankamiza Hosgeldiniz\n\tFaiz orani:%6");

        double anaPara;
        int vade;
        System.out.println();
        System.out.print("Yatirmak istediginiz tutar : ");
        anaPara= scan.nextInt();
        System.out.print("Paranizi kac yil vadeli yatirmak istiyorsunuz : ");
        vade= scan.nextInt();


        double faizOrani=0.06;

        for (int i = 1; i <=vade ; i++) {
            anaPara+=(faizOrani*anaPara);
            System.out.println(i+" yilin sonunda toplam para : "+(int)anaPara);


        }


    }
}
