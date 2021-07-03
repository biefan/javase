import java.util.Scanner;

public class xingqi {
    public static void main(String[] args) {
        Scanner bf= new Scanner(System.in);
        System.out.println("输入1-7:"
        );
        int adg=bf.nextInt();
        switch (adg){
            case 1:
               System.out.println("星期一");
               break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5 :
                System.out.println("星期五");
            case 6 :
                System.out.println("星期六");
            case 7 :
                System.out.println("星期日");
            default:
        }
        //可以改为System.out.println("不存在");
        break;
        if (adg>=7){
            System.out.println("不存在");
        }
    }
    }
