package 每日一题;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2020/3/20-14:52
 */
public class Main17连续最大和 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (input.hasNext()){
            int n=input.nextInt();
            int[]arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=input.nextInt();
            }
            int max=arr[0];//注意全负数的情况
            int sum=arr[0];
            for (int i = 1; i < n; i++) {//注意
                if(sum>=0){
                    sum+=arr[i];
                }else {
                    sum=arr[i];
                }
                if(sum>max){
                    max=sum;
                }
            }
            System.out.println(max);
        }
    }
}
