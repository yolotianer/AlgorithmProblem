package 每日一题;

import java.util.*;
public class Main01学分绩点 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]credit=new int[n];
        int sumCredit=0;
        for(int i=0;i<n;i++){
            credit[i]=input.nextInt();
            sumCredit+=credit[i];
        }
        int[]grade=new int[n];
        for(int i=0;i<n;i++){
            grade[i]=input.nextInt();
        }
        double creditNum=0;
        for(int i=0;i<n;i++){
            creditNum+=credit[i]*method(grade[i]);
        }
        double GPA=creditNum/sumCredit;
        System.out.printf("%.2f",GPA);
    }
    public static double method(int grade){
        if(grade>=90){
            return 4.0;
        }else if(grade>=85){
            return 3.7;
        }else if(grade>=82){
            return 3.3;
        }else if(grade>=78){
            return 3.0;
        }else if(grade>=75){
            return 2.7;
        }else if(grade>=72){
            return 2.3;
        }else if(grade>=68){
            return 2.0;
        }else if(grade>=64){
            return 1.5;
        }else if(grade>=60){
            return 1.0;
        }else {
            return 0;
        }
    }
}