package ders59_MOverGelismisHesapMakinesi;

import java.util.Scanner;

public class C01 {
     /*
    Method Overloading kullanak bir tane hesap makinesi tasarlamaya çalışın.
    Toplama ve Çarpma metodlarını 2 veya 3 parametre alacak şekilde tasarlayın.

    */

    public static int cikarma(int a, int b) {
        return (a - b);
    }

    public static double bolme(int a, int b) {
        return ((double) a / b);
    }

    public static int toplama(int a, int b) {
        return (a + b);
    }

    public static int toplama(int a, int b, int c) {
        return (a + b + c);
    }

    public static int carpma(int a, int b) {
        return (a * b);
    }

    public static int carpma(int a, int b, int c) {
        return (a * b * c);
    }

    public static void main(String[] args) {
        String islemler = """
                1-Toplama+
                2-Cikarma+
                3-Carpma+
                4-Bolme+
                Cikis icin q'ya basiniz.
                """;
        System.out.println("****************************************");
        System.out.println(islemler);
        System.out.println("****************************************");

        while (true) {
            System.out.print("\nIslemi seciniz : ");
            Scanner scan = new Scanner(System.in);
            String islem = scan.nextLine();
            int kacSayi = 0;

            if (islem.equalsIgnoreCase("q")) {
                System.out.println("Programdan cikiliyor");
                break;
            } else if (islem.equals("1")) {
                System.out.print("Kac sayi toplamak istiyorsunuz?[2 veya 3] : ");
                kacSayi = scan.nextInt();
                if (kacSayi == 2) {
                    System.out.print("a : ");
                    int a = scan.nextInt();
                    System.out.print("b : ");
                    int b = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Girilen sayilarin toplami : " + toplama(a, b));

                } else if (kacSayi == 3) {
                    System.out.print("a : ");
                    int a = scan.nextInt();
                    System.out.print("b : ");
                    int b = scan.nextInt();
                    System.out.print("c : ");
                    int c = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Girilen sayilarin toplami : " + toplama(a, b, c));


                } else {
                    System.out.println("Bunun icin uygun method bulunmuyor..");
                }
            } else if (islem.equals("2")) {

                System.out.print("a : ");
                int a = scan.nextInt();
                System.out.print("b : ");
                int b = scan.nextInt();
                scan.nextLine();
                System.out.print("Girilen sayilarin farki : " + cikarma(a, b));
            } else if (islem.equals("3")) {
                System.out.print("Kac sayi carpmak istiyorsunuz?[2 veya 3] : ");
                kacSayi = scan.nextInt();
                if (kacSayi == 2) {
                    System.out.print("a : ");
                    int a = scan.nextInt();
                    System.out.print("b : ");
                    int b = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Girilen sayilarin carpimi : " + carpma(a, b));

                } else if (kacSayi == 3) {
                    System.out.print("a : ");
                    int a = scan.nextInt();
                    System.out.print("b : ");
                    int b = scan.nextInt();
                    System.out.print("c : ");
                    int c = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Girilen sayilarin carpimi : " + carpma(a, b, c));


                }

            } else if (islem.equals("4")) {

                System.out.print("a : ");
                int a = scan.nextInt();
                System.out.print("b : ");
                int b = scan.nextInt();
                scan.nextLine();
                System.out.print("Girilen sayilarin bolumu : " + bolme(a, b));

            }
            else {
                System.out.println("Yanlis giris yaptiniz!..");
            }

        }

    }
}