package 每日一题;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2020/3/3-22:27
 */
public class Main04 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Map<String,Integer>map=new HashMap<>();
        String name=input.nextLine();
        String[] names = name.split(" ");
        for (int i = 0; i <names.length ; i++) {
            map.put(names[i],0);
        }
        int m=input.nextInt();
        String ticket=input.nextLine();
        String[] tickets = ticket.split(" ");
        int other=0;
        for (int i = 0; i < m; i++) {
            if(map.containsKey(tickets[i])){
                int count=map.getOrDefault(tickets[i],0);
                map.put(tickets[i],++count);
            }else {
                other++;
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("Invalid :"+other);
    }
}
