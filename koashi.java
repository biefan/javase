import java.util.Scanner;

public class koashi {
    public static void main(String[] args) {
        Scanner bf=new Scanner(System.in);
        System.out.println("输入你的成绩：");
       int adg=bf.nextInt();
       if (adg <=0||adg>=100){
           System.out.println("成绩错误");
       }
       else
       if (adg>=95 && adg <=100){
           System.out.println("阿姨一个");
       }else if (adg >=90 &&adg  <=94){
           System.out.println("少女一个");

       }
       else if (adg >=80 && adg<=89){
           System.out.println("按摩一次");
       }
       else if(adg <=80){
           System.out.println("等着挨打吧");
       }
    }
}
