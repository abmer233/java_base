package com.lxyedu.encap.interface_;

public class phone implements usbInterface{
    @Override
    public void start() {
        System.out.println("手机正在开机");
    }

    @Override
    public void end() {
        System.out.println("手机正在关机");
    }
}
