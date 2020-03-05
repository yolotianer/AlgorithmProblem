package 每日一题;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2020/3/5-15:24
 */
public class Main07守形数 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=n*n;
        String str1=String.valueOf(n);
        String str2=String.valueOf(m);
        int index=str2.indexOf(str1);
        if(index==-1){
            System.out.println("No!");
        }else{
            if(str2.length()-str1.length()==index){
                System.out.println("Yes!");
            }else{
                System.out.println("No!");
            }
        }
    }
}
