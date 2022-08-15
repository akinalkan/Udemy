package ders65_OOP_AtmProjesi;

import java.util.Scanner;

public class Atm {
    public void calis(Hesap hesap){
        Login login=new Login();

        Scanner scan=new Scanner(System.in);
        System.out.println("Bankamiza Hosgeldiniz ");
        System.out.println("***************************");
        System.out.println("Kullanici Girisi");
        System.out.println("***************************");
        int girisHakki=3;

        while (true){
            if(login.login(hesap)){
                System.out.println("Giris basarili");
                break;
            }else {
                System.out.println("Giris basarisiz");
                girisHakki--;
                System.out.print("Kalan Giris Hakki : "+girisHakki);
            }
            if (girisHakki==0){
                System.out.println("Giris hakkiniz bitti..");
                return;
            }
        }

        System.out.println("****************************");
        String islemler= """
                \n1-Bakiye goruntuleme\n+
                2-Para Yatirma\n+
                3-Para Cekme\n+
                4-Cikis icin q'ya basiniz""";

        System.out.println("islemler = " + islemler);
        System.out.println("****************************");

        while (true){
            System.out.print("Islem seciniz : ");
            String islem= scan.nextLine();
            if(islem.equalsIgnoreCase("q")){
                break;
            } else if (islem.equals("1")) {
                System.out.println("Kalan bakiyeniz : "+hesap.getBakiye());


            } else if (islem.equals("2")) {
                System.out.print("Yatirmak istediginiz tutari giriniz : ");
                int tutar=scan.nextInt();
                scan.nextLine();
                hesap.paraYatir(tutar);

            } else if (islem.equals("3")) {
                System.out.print("Cekmek istediginiz tutari giriniz : ");
                int tutar= scan.nextInt();
                scan.nextLine();
                hesap.paraCek(tutar);

            }else {
                System.out.println("Gecersiz islem..");
            }
        }






    }
}
