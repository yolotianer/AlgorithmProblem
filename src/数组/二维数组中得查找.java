package 数组;

/**
 * @author yolo
 * @date 2020/2/20-20:33
 */
public class 二维数组中得查找 {
    public boolean Find(int target, int [][] array) {
        int i=0;
        int j=array[0].length-1;
        while(i<array.length&&j>=0){
            if(array[i][j]==target){
                return true;
            }else if(array[i][j]<target){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}
