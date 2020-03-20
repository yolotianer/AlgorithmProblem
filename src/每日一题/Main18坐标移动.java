package 每日一题;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2020/3/20-15:25
 */
public class Main18坐标移动 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (input.hasNext()){
            int x=0,y=0;
            String str=input.nextLine();
            String[] split = str.split(";");
            for (int i = 0; i < split.length; i++) {
                System.out.println(split[i]);
                String c = split[i].substring(0, 1);
                split[i]=split[i].substring(1);
                int temp=Integer.parseInt(split[i]);
                if(c.equals("A")){
                    x-=temp;
                }else if(c.equals("D")){
                    x+=temp;
                }else if(c.equals("W")){
                    y-=temp;
                }else {
                    y+=temp;
                }
            }
            System.out.println(x+","+y);
        }
    }
}
