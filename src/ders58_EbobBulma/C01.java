package ders58_EbobBulma;

import java.util.Scanner;

public class C01 {
    public static int ebobBulma(int sayi1,int sayi2){
        int ebob=1;
        for (int i = 1; i <=sayi1  && i<=sayi2; i++) {

            if((sayi1%i==0) && (sayi2%i==0)){
                ebob=i;
            }
        }
        return ebob;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner((System.in));
        System.out.print("Birinci sayi : ");
        int sayi1= scan.nextInt();
        System.out.print("Ikinci sayi : ");
        int sayi2= scan.nextInt();
        System.out.println("ebob("+sayi1+","+sayi2+") = " + ebobBulma(sayi1, sayi2));


    }
}
