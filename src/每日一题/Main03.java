
package 每日一题;
import java.util.*;
/**
 * @author yolo
 * @date 2020/3/3-21:42
 */

public class Main03{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n,sum1=0,sum2=0,temp=0;
        while(input.hasNext()){
            n=input.nextInt();
            while(n!=0){
                temp=n%10;
                sum1+=temp;
                sum2+=Math.pow(temp,2);
                n/=n;
            }
            System.out.println(sum1+" "+sum2);
        }
    }
}


