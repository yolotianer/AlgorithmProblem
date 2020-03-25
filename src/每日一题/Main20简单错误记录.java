package 每日一题;

import java.util.*;

/**
 * @author yolo
 * @date 2020/3/25-22:24
 */
public class Main20简单错误记录 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Map<String,Integer> map=new LinkedHashMap<>();
        String key;
        String filename;
        String path;

        //存储过程
        while (input.hasNext()){
            path=input.next();
            //E:\V1R2\product\fpgadrive.c   1325
            //路径名转换文件名
            int id=path.lastIndexOf('\\');//最后一个/的下标
            filename=id<0?path:path.substring(id+1);
            int linenum=input.nextInt();

            //统计频率
            key=filename+" "+linenum;
            int count=map.getOrDefault(key,0);
            map.put(key,++count);
        }
        input.close();

        //对记录进行排序
        List<Map.Entry<String,Integer>>list=new LinkedList<Map.Entry<String, Integer>>();
        int m=0;
        for (Map.Entry<String, Integer> entry : list) {
            m++;
            if(m<=8){
                String[] s = entry.getKey().split(" ");
                String k=s[0].length()>16?s[0].substring(s[0].length()-16):s[0];
                String n=s[1];
                System.out.println(k+" "+n+" "+entry.getValue());
            }else {
                break;
            }
        }
    }
}
