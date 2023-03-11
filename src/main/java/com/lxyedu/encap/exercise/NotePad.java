package com.lxyedu.encap.exercise;

public class NotePad extends Computer {
    private String color;

    public NotePad(String cpu, double memory, double disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void info1(){
        System.out.println("Notepad信息为");
        System.out.println(getDetail() + "颜色为" + color);
    }
}
