import java.util.Scanner;

public class kaoshi2 {
    public static void main(String[] args) {
        Scanner bf =new Scanner(System.in);
        System.out.println("输入你的成绩" );
        int adg =bf.nextInt();
        if (adg>=0&& adg>=100)

        if (adg >=95 &&adg<=100) {
            System.out.println("少妇一个");
        }else
                if (adg >= 90 &&adg <=94){
                    System.out.println("少女一个");

                }else
                    if (adg >=80 &&adg <=90){
                        System.out.println("按摩一次");
                    }else
                        if(adg >=79 &&adg<=70 ){
                            System.out.println("等着挨打吧");
                        }
                        else{
                            System.out.println("成绩错误");}
                }
        }

