package ders46_BreakVeContinue;

public class C04 {
    public static void main(String[] args) {
        int  i=0;
        while (i<10){
            if(i==3 ||i==5){
                //i++; olursa sonsuz dongu olmaz
                continue;//---->sonsuz donguye girer .i'nin degeri arttirilmadi
            }
            System.out.println("i = " + i);
            i++;

        }




    }
}
