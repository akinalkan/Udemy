package ders50_KullaniciGirisiProgrami;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        // while döngüsü yardımıyla bir kullanıcı girişi yazmaya çalışın.
        Scanner scan=new Scanner(System.in);
        int girisHakki=3;

        String sys_Kullanici_adi="Akin Alkan";
        String sys_parola="12345";

        System.out.println("****************************");
        System.out.println("Kullanici Girisine Hosgeldiniz");
        System.out.println("****************************");
        while (true){
            System.out.print("Kullanici Adi : ");
            String kullanici=scan.nextLine();
            System.out.print("Parola : ");
            String parola= scan.nextLine();

            if(parola.equalsIgnoreCase(sys_parola) && kullanici.equals(sys_Kullanici_adi)){
                System.out.println("Hosgeldiniz "+kullanici);
                break;
            } else if (!parola.equalsIgnoreCase(sys_parola) && kullanici.equals(sys_Kullanici_adi)) {
                System.out.println("Parolaniz hatali");
                girisHakki--;
                System.out.println("Kalan giris hakki : "+girisHakki);
            }else if (parola.equalsIgnoreCase(sys_parola) && !kullanici.equals(sys_Kullanici_adi)) {
                System.out.println("Kullanici adi hatali");
                girisHakki--;
                System.out.println("Kalan giris hakki : "+girisHakki);
            }else {
                System.out.println("Kullanici adiniz ve parolaniz yanlis");
                girisHakki--;
                System.out.println("Kalan giris hakki : "+girisHakki);
            }
            if(girisHakki==0){
                System.out.println("Giris hakkiniz bitti");
                break;
            }
        }

    }
}
