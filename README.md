#### 1.二维数组中得查找
**题目描述：**
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
- 思路：
    每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。从左上角进行查找，
    - 若array[i][j]==target，返回true
    - 若array[i][j]<target,向下查找，j++
    - 若array[i][j]>target,向左查找，i--
    
```
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
```
#### 2.替换空格
**题目描述：**
请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
- 方法一：调用函数public String replace(CharSequence target, CharSequence replacement)
```
public String replaceSpace(StringBuffer str) {
        return str.toString().replace(" ","%20");
    }
```
- 方法二：利用下标，index==-1，表示不存在，index！=-1则进行替换操作
```
public String replaceSpace(StringBuffer str) {
        int index;
        while ((index=str.indexOf(" "))!=-1){
            str.replace(index,index+1,"%20");
        }
        return str.toString();
    }
```
#### 3.从尾到头打印链表
**题目描述：**
输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
```
/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer>result=new ArrayList<>();
        while (listNode!=null){
            result.add(0,listNode.val);//头插即可
            listNode=listNode.next;
        }
        return result;
    }
}
```

#### 4.重建二叉树
**题目描述：**
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。



- 思路：
    - 二叉树前序遍历：根-左-右
    - 二叉树中序遍历：左-根-右
    - 重构二叉树必须右中序遍历得存在
    - 中序遍历数组：根结点之前得为左子树，根节点之后得为右子树
    - 利用递归：递归出口-任一数组长度为0
```
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.Arrays;
public class Solution {
   public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if(pre.length==0||in.length==0){
            return null;
        }
        int i=0;
        TreeNode root=new TreeNode(pre[0]);
        while (i<pre.length&&in[i]!=root.val){
            i++;
        }
        root.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),
                Arrays.copyOfRange(in,0,i));
        root.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),
                Arrays.copyOfRange(in,i+1,in.length));
        return root;
    }
}
```
 

#### 5.用两个栈实现队列
**题目描述：**
用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
- 思路： 
    - 栈：先进后出
    - 队列：先进先出
    - POP：直接调用Stack得pop函数即可完成入队列操作
    - PUSH：保证另一个栈为空，且当前栈不为空得情况，从当前栈并入栈于另一个栈，再另一个栈里调用push，即可完成出队列操作
```
import java.util.Stack;

public class Solution {
   Stack<Integer>stack1=new Stack<>();
    Stack<Integer>stack2=new Stack<>();
    public void push(int node){
        stack1.push(node);
    }

   public int pop(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();

    }
}
```
