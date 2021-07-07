package mfor;

public class Testfor3 {
    public static void main(String[] args) {
        int bf1=0;
       for (int i=100;i<=999;i++){
           int ge=i%10;
           int shi=i/10%10;
           int bai=i /10/10%10;
           if (ge*ge*ge + shi*shi*shi + bai*bai*bai==i){
               System.out.print(i+" ");
            bf1++;
if (bf1%2==0){
    System.out.println();
}

           }
       }

    }
}
