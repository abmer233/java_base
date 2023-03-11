package com.lxyedu.encap.HomeWork;

public class homework004 {
    public static void main(String[] args) {
        System.out.println("====交换前====");
        String str = "abcdef";
        System.out.println(str);
        System.out.println("====交换后====");
        System.out.println(reverse(str,1,4));

    }public static String reverse(String str,int start,int end){
        char[] chars = str.toCharArray();
        char temp = ' ';
        if (!(start > 0 && end < chars.length && chars != null)){
            throw new RuntimeException("参数不正确");
        }
        for (int i = start, j = end;i < j;i++,j--){
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
