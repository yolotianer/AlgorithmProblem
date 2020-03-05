package 每日一题;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2020/3/5-15:36
 * 题目描述
 * 密码要求:
 * 1.长度超过8位
 * 2.包括大小写字母.数字.其它符号,以上四种至少三种
 * 3.不能有相同长度超2的子串重复
 * 说明:长度超过2的子串
 * 输入描述:
 * 一组或多组长度超过2的子符串。每组占一行
 * 输出描述:
 * 如果符合要求输出：OK，否则输出NG
 *
 * 示例1
 * 输入
 * 复制
 * 021Abc9000
 * 021Abc9Abc1
 * 021ABC9000
 * 021$bc9000
 * 输出
 * 复制
 * OK
 * NG
 * NG
 * OK
 */
public class Main08密码验证验证合格程序 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String passWord=input.nextLine();
            if(passWord.length()>8&&method1(passWord)&&method2(passWord)){
                System.out.println("OK");
            }else {
                System.out.println("NG");
            }
        }
    }

    /**
     * 判断是否包含大小写字母，数字，其它符号至少三种
     * @param passWord
     * @return
     */
    private static boolean method1(String passWord) {
        Map<String,Integer>map=new HashMap<>();
        for (int i = 0; i <passWord.length() ; i++) {
            char c=passWord.charAt(i);
            if(Character.isUpperCase(c)){
                int count=map.getOrDefault("Uppercase",0);
                map.put("Uppercase",count++);
            } else if(Character.isLowerCase(c)){
                int count=map.getOrDefault("LowerCase",0);
                map.put("LowerCase",count++);
            }else if(Character.isDigit(c)){
                int count=map.getOrDefault("Digit",0);
                map.put("Digit",count++);
            }else {
                int count=map.getOrDefault("Other",0);
                map.put("Other",count++);
            }
        }
        if(map.entrySet().size()>=3){
            return true;
        }
        return false;
    }

    /*
    public static boolean checkCharKinds(String password){
            int Digit=0 , lowercase=0,uppercase=0,others=0;
            char[] ch = password.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i]>='0'&&ch[i]<='9') {
                    Digit=1;
                    continue;
                }
                else if (ch[i]>='a'&&ch[i]<='z') {
                    lowercase=1;
                    continue;
                }
                else if (ch[i]>='A'&&ch[i]<='Z') {
                    uppercase=1;
                    continue;
                }else {
                    others=1;
                    continue;
                }
            }
            int total = Digit+lowercase+uppercase+others;
            return total>=3 ? true : false;
        }
     */
    /**
     * 判断是否存在相同长度超过2的字符串
     * @param passWord
     * @return
     */
    private static boolean method2(String passWord) {
        for (int i = 0; i < passWord.length()-2; i++) {
            String str=passWord.substring(i,i+3);
            if(passWord.substring(i+1).contains(str)){
                return false;
            }
        }
       return true;
    }
}
