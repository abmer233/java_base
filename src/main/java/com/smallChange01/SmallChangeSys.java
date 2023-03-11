package com.smallChange01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        String key = "";
        String detail = "------------------零钱通明细-----------------";
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String note = "";
        Scanner scanner = new Scanner(System.in);
        do {//使用do while语句可以保持死循环,只要结果一直是true
            System.out.println("----------------零钱通菜单---------------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.println("\t请选择（1 ~ 4）");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.println("收益入账金额:");
                    money = scanner.nextDouble();
                    balance += money;
                    date = new Date();
                    detail += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.println("消费金额:");
                    money = scanner.nextDouble();
                    System.out.println("消费说明:");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();
                    detail += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    String choice = "";
                    while (true) {
                        System.out.println("你确定要退出吗？ y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice))
                        {
                            break;
                        }
                    }
                    if ("y".equals(choice)) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("你输入有误");
            }
        } while (loop);
        System.out.println("-----------退出了零钱通菜单-----------");
    }
}
