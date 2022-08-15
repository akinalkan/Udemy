package ders65_OOP_AtmProjesi;

import java.util.Scanner;

public class Login {
    public  boolean login(Hesap hesap){
        Scanner scan=new Scanner(System.in);
        String kullaniciAdi;
        String parola;
        System.out.print("\nKullanici Adi : ");
        kullaniciAdi= scan.nextLine();
        System.out.print("\nParola : ");
        parola= scan.nextLine();

        if(hesap.getKullaniciAdi().equals(kullaniciAdi) && hesap.getParola().equals(parola)){
            return true;
        }else
            return false;

    }
}
