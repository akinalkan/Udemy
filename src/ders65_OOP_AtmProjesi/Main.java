package ders65_OOP_AtmProjesi;

public class Main {
    // Object Oriented(Nesne Yönelimli ) ATM Programı

    // Login Class'ı Kullanıcı Girişini Kontrol Edecek.

    // Hesap Class'ı Hesap İşlemlerini Yapacak.

    // ATM ise atmmizi çalıştıracak.
    public static void main(String[] args) {
        Atm atm=new Atm();
        Hesap hesap=new Hesap("Akin Alkan","12345",5000);
        atm.calis(hesap);
        System.out.println("Programdan cikiliyor");
    }

}
