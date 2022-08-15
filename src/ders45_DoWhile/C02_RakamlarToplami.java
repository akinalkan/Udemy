package ders45_DoWhile;

import java.util.Scanner;

public class C02_RakamlarToplami {
    public static void main(String[] args) {
        //1234
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi= scan.nextInt();
        int ilkSayi=sayi;
        int toplam=0;
        do{
            toplam+=sayi%10;
            sayi/=10;

        }while ((sayi>0));
        System.out.println(ilkSayi+"'nin rakamlari toplami : "+toplam+" 'dur");
    }
}
