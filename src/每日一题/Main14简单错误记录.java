package 每日一题;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2020/3/9-13:18
 */
public class Main14简单错误记录 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String s=input.nextLine();
            String[]arr=s.split(" ");
            for(int i=arr.length-1;i>=0;i--){
                if(i!=0){
                    System.out.print(arr[i]+" ");
                }else{
                    System.out.print(arr[i]);
                }
            }
        }
    }
}
