package 每日一题;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2020/3/4-14:38
 */
public class Main05找X {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(input.nextInt(),i);
        }
        int x=input.nextInt();
        if(map.containsKey(x)){
            System.out.println(map.get(x));
        }else{
            System.out.println(-1);
        }
    }
}
