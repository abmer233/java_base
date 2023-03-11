package com.lxyedu.encap.interface_;

public class interface01 {
    public static void main(String[] args) {
        camera camera = new camera();
        phone phone = new phone();
        Computer computer = new Computer();
        computer.work(phone);
        System.out.println("=============");
       computer.work(camera);
    }
}
