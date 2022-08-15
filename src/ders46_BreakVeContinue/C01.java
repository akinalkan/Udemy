package ders46_BreakVeContinue;

public class C01 {
    public static void main(String[] args) {
        /*
         break anahtar kelimesi

            Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle
             karşılaştığı zaman çalışmasını durdurur.
            Böylelikle döngü hiçbir koşula bağlı kalmadan sonlanmış olur.

            break ifadesi sadece ve sadece içinde bulunduğu döngüyü sonlandırır.
             Eğer iç içe döngüler varsa
            ve içteki döngüde break kullanılmışsa sadece içteki döngü sona erer.

            continue anahtar kelimesi

            Döngü herhangi bir yerde ve herhangi bir zamanda continue
            ifadesiyle karşılaştığı zaman geri kalan
            işlemlerini yapmadan direk döngü bloğunun başına döner.
         */
        int i=0;

        while(i<20){
            if(i==10){//Dongu 10'da sonlanmis oldu
                break;
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}
