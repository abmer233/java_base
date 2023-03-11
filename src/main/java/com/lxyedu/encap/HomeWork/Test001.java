package com.lxyedu.encap.HomeWork;


import static com.sun.xml.internal.fastinfoset.tools.PrintTable.printArray;

public class Test001 {
    public static void main(String[] args) {
        String username = "牛牛";
        String passwd = "253457";
        String email = "1416510031@qq.com";
        try {
            usernameRegister(username);
            passwdRegister(passwd);
            emailRegister(email);
            System.out.println("恭喜你注册成功了");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
    public static String usernameRegister(String username){
        char[] chars = username.toCharArray();
        if (!(username.length() >= 2 && username.length() <= 4)){
            throw new RuntimeException("用户名不正确");
        }

            System.out.println("用户名为" + username);

        return new String(username);
    }
    public static String passwdRegister(String passwd){
        char[] chars1 = passwd.toCharArray();
        if (!(passwd.length() == 6) && isDigital(passwd)){
            throw new RuntimeException("密码输入不正确");
        }

            System.out.println("密码为" + passwd);

        return new String(passwd);
    }
    public static String emailRegister(String email){
        char[] chars2 = email.toCharArray();
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)){
            throw new RuntimeException("邮箱不正确");
        }
        System.out.println("邮箱为" + email);
        return new String(email);
    }
    public static boolean isDigital(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9'){
                return false;
            }
        }return true;
    }
}
