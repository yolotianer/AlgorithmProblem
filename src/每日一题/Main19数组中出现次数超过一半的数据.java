package 每日一题;

import java.util.zip.CheckedOutputStream;

/**
 * @author yolo
 * @date 2020/3/25-20:43
 */
public class Main19数组中出现次数超过一半的数据 {
    public static void main(String[] args) {

    }

    /**
     * 出现次数超过一半的数字，至少会连着出现一次
     * @param array
     * @return
     * 链接：https://www.nowcoder.com/questionTerminal/e8a1b01a2df14cb2b228b30ee6a92163?answerType=1&f=discussion
     * 来源：牛客网
     *
     * 先把最有可能满足题意要求的数字保存起来，然后在最后判断它是否满足要求
     * 如果满足就返回它的值，如果不满足就返回0，但是它比解法一高效的地方在于没有排序，直接进行的遍历。
     *
     * 方法：我们在遍历数组的时候，保存两个值，一个是数组中的数字，另一个是次数
     * 当遍历到下一个数字的时候，如果和上一次的数字一样则次数加1，如果不一样次数减一(相当于抵消了)
     * 如果次数为0了，那就保存下一个数字，并把次数设置为1
     * 因为我们要找的数字如果存在最后一定是把次数设置为1的那个数。
     */
    public int MoreThanHalfNum_Solution(int [] array){
        if(array==null||array.length==0){
            return 0;
        }
        int preValue=array[0];
        int count=1;
        for (int i = 1; i < array.length; i++) {
            if(array[i]==preValue){//当前元素等于前一个元素，zhuo'zhe'hsi
                count++;
            }else {
                count--;
                if(count==0){
                    preValue=array[i];
                    count=1;
                }
            }
        }

        //判断是否存在出现次数大于一半的数
        int num=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==preValue){
                num++;
            }
        }
        return num>array.length/2?preValue:0;
    }
}
