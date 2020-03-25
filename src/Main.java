import java.util.Arrays;
import java.util.Scanner;
/**
 * @author yolo
 * @date 2020/3/21-15:18
 */
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[]arr={8,57,79,5,4,7,68,20};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int startIndex, int endIndex) {
        if(startIndex>=endIndex){
            return ;
        }
        int pivotIndex=partition(arr,startIndex,endIndex);
        sort(arr,startIndex,pivotIndex-1);
        sort(arr,pivotIndex+1,endIndex);
    }

    private static int partition(int[] arr, int startIndex, int endIndex) {
        int povite=arr[startIndex];
        int left=startIndex;
        int right=endIndex;
        while (left!=right){
            while (arr[right]>povite&&left<right){
                right--;
            }
            while (arr[left]<=povite&&left<right){
                left++;
            }
            if(left<right){
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
            }
        }
        arr[startIndex]=arr[left];
        arr[left]=povite;
        return left;
    }
}


