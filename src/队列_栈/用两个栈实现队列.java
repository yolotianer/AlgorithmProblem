package 队列_栈;

import java.util.Stack;

/**
 * @author yolo
 * @date 2020/2/20-23:04
 */
public class 用两个栈实现队列 {
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
