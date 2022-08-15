package ders47_DöngülerleATM;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        /*

        While döngüsü yardımıyla bir tane ATM programı yapmaya çalışın.

        İşlemler
        1.İşlem : Bakiye Öğrenme
        2.İşlem : Para Çekme
        3.İşlem : Para Yatırma
        Çıkış : q

        */
        Scanner scan = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1.İşlem : Bakiye Öğrenme\n2.İşlem : Para Çekme\n3.İşlem : Para Yatırma\nÇıkış : q";
        System.out.println("***************islemler***********  \n" + islemler);
        System.out.println("**********************************");

        while (true){
            System.out.print("Islemi seciniz : ");
            String islem= scan.nextLine();
            if(islem.equalsIgnoreCase("q")){
                System.out.println("Programdan cikiliyor");
                break;
            } else if (islem.equals("1")) {
                System.out.println("bakiye = " + bakiye);

            } else if (islem.equals("2")) {
                System.out.print("Cekmek istediginiz tutar : ");
                int tutar= scan.nextInt();
                scan.nextLine();//dummy -->nextInt den sonra bir adet nextLine yaziliyor
                if (bakiye-tutar<0){
                    System.out.println("Yeterli bakiye yok.Bakiyeniz : "+bakiye);
                }else {
                    bakiye-=tutar;
                    System.out.println("Yeni bakiye = " + bakiye);
                }

            } else if (islem.equals("3")) {
                System.out.print("Yatirmak istediginiz tutar : ");
                int tutar= scan.nextInt();
                scan.nextLine();
                bakiye+=tutar;
                System.out.println("Yeni bakiye = " + bakiye);


            }else {
                System.out.println("Gecersiz islem");
            }
        }


    }
}
