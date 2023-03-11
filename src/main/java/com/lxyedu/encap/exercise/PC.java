package com.lxyedu.encap.exercise;

public class PC extends Computer{
    private String brand;

    public PC(String cpu, double memory, double disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void info(){
        System.out.println("PC的信息为");
        System.out.println(getDetail() + "品牌为" + brand);
    }
}
