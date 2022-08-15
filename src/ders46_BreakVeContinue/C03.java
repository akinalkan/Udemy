package ders46_BreakVeContinue;

public class C03 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i==3||i==5){//i-->3 veya 5 olursa direk gececek
                continue;
            }
            System.out.println("i = " + i);

        }
    }
}
