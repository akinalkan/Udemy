package ders46_BreakVeContinue;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true){//sonsuza kadar true
            System.out.println("Lutfen bir sayi giriniz");
            int islem= scan.nextInt();

            if(islem==-1){
                System.out.println("Donguden cikiliyor");
                break;
            }
            System.out.println("islem = " + islem);


        }

    }
}
