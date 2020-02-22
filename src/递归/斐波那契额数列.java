package 递归;

/**
 * @author yolo
 * @date 2020/2/22-23:28
 */
public class 斐波那契额数列 {
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
}
