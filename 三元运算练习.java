package biefan;

import java.util.Scanner;

public class duoyuanhuajisuan2 {
    public static void main(String[] args) {
        Scanner bf=new Scanner(System.in);
        System.out.println("输入随机数:");
        int adg= bf.nextInt();
        int adg2=bf.nextInt();
        int adg3=bf.nextInt();
        int temp =adg>adg2 ? adg:adg2;
        int adg4 = temp>adg3 ? temp:adg3;
        System.out.println("最大值");
        System.out.println(adg4);
    }
}
