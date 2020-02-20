package 链表;

import java.util.ArrayList;

/**
 * @author yolo
 * @date 2020/2/20-22:24
 */
public class 从尾到头打印链表 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer>result=new ArrayList<>();
        while (listNode!=null){
            result.add(0,listNode.val);
            listNode=listNode.next;
        }
        return result;
    }
}
