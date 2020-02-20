//package 字符串;
//
///**
// * @author yolo
// * @date 2020/2/20-21:16
// */
//public class 替换空格 {
//
//    public static void main(String[] args) {
//        StringBuffer str=new StringBuffer("We Are Happy.");
//        System.out.println(replaceSpace(str));
//    }
//    public static String replaceSpace(StringBuffer str) {
//        int index;
//        while ((index=str.indexOf(" "))!=-1){
//            str.replace(index,index+1,"%20");
//        }
//        return str.toString();
//    }
//    public String replaceSpace(StringBuffer str) {
//        return str.toString().replace(" ","%20");
//    }
//}
