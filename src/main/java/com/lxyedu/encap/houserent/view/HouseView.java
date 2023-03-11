package com.lxyedu.encap.houserent.view;

import com.lxyedu.encap.houserent.domain.House;
import com.lxyedu.encap.houserent.service.HouseService;

import java.util.Scanner;

public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    Scanner myscanner = new Scanner(System.in);
    private HouseService houseService = new HouseService(10);
    public void update(){
        System.out.println("============修改房屋信息==============");
        System.out.println("请选择待修改的房屋编号（-1表示退出）");
        int updateId = myscanner.nextInt();
        if (updateId == -1) {
            System.out.println("你放弃了修改房屋的的信息");
            return;
        }
            House byId = houseService.findById(updateId);
            if (byId == null){
                System.out.println("修改房屋的信息编号不存在");
            }
            System.out.println("姓名("+ byId.getName()+"):");
            String newname = myscanner.next();
            if (newname.equals(newname)) {
                byId.setName(newname);
            }
        System.out.println("电话("+ byId.getPhone()+"):");
            String newphone = myscanner.next();
        if (newphone.equals(newname)) {
            byId.setPhone(newphone);
        }
    }
    public void findHouse(){
        System.out.println("============查找房屋信息==============");
        System.out.println("请输入要查找的id:");
        int findid = myscanner.nextInt();
        House byId = houseService.findById(findid);
        if (byId != null){
            System.out.println(byId);
        }else {
            System.out.println("============查找房屋信息id不存在==============");
        }
    }
    public void delHouse(){
        System.out.println("============删除房屋==============");
        System.out.println("============请输入待删除房屋编号（-1退出）==============");
        int delId = myscanner.nextInt();
        if (delId == -1){
            System.out.println("============放弃删除房屋信息==============");
        }
        System.out.println("请确认是否删除（Y/N）");
        char c = myscanner.next().charAt(0);
        for (;;) {
            if (c == 'Y' || c == 'N') {
                break;
            }else {
                System.out.println("输入错误，请输入Y或者N");
            }
        }
        if (c == 'Y'){
            if (houseService.del(delId)){
                System.out.println("============删除房屋信息成功==============");
            }else {
                System.out.println("============房屋编号不存在，删除失败==============");
            }
        }
    }
    public void addHouse(){
        System.out.println("============添加房屋==============");
//        System.out.println("id:");
//        int id = myscanner.nextInt();
        System.out.print("姓名:");
        String name = myscanner.next();
        System.out.print("电话:");
        String phone = myscanner.next();
        System.out.print("地址:");
        String address = myscanner.next();
        System.out.print("月租:");
        int rent = myscanner.nextInt();
        System.out.print("状态:");
        String state = myscanner.next();
        House newHouse = new House(0,name,phone,address,rent,state);
        if (houseService.add(newHouse)){
            System.out.println("============添加房屋成功==============");
        }else {
            System.out.println("============添加房屋失败==============");
        }
    }
    public void listHouses(){
        System.out.println("============房屋列表==============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("============房屋列表显示完毕==============");
    }
    public void mainMenu(){
        do {
            System.out.println("\n============房屋出租系统==============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息 ");
            System.out.println("\t\t\t4 修 改 房 屋 信 息 ");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退    出");
            System.out.println("请输入你的选择1~6:");
            key = myscanner.next().charAt(0);
            switch (key){
                case '1':
                    System.out.println("新增");
                    addHouse();
                    break;
                case '2':
                    System.out.println("查找");
                    findHouse();
                    break;
                case '3':
                    System.out.println("删除");
                    delHouse();
                    break;
                case '4':
                    System.out.println("修改");
                    break;
                case '5':
                    System.out.println("访问列表");
                    listHouses();
                    break;
                case '6':
                    System.out.println("退出");
                    loop = false;
                    break;
            }
        }while (loop);
    }
}
