package com.lxyedu.encap.encaps;

public class Account {
    private String name;
    private double meplament;
    private String passwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 2 || name.length() == 3 || name.length() == 4) {
            this.name = name;
            System.out.println("名字长度正确");
        }
    }

    public double getMeplament() {
        return meplament;
    }

    public void setMeplament(double meplament) {
        if (meplament > 20) {
            this.meplament = meplament;
            System.out.println("余额正确");
        }
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        if (passwd.length() == 6) {
            this.passwd = passwd;
        } else {
            System.out.println("输入的密码长度不符合");
            System.out.println("默认密码为123456");
        }
    }
}
