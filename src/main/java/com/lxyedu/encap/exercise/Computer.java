package com.lxyedu.encap.exercise;

public class Computer {
    private String cpu;
    private double memory;
    private double disk;

    public Computer(String cpu, double memory, double disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getDisk() {
        return disk;
    }

    public void setDisk(double disk) {
        this.disk = disk;
    }
    public String getDetail(){
        return "cpu型号为" + cpu + "内存的型号为" + memory + "硬盘的型号为" + disk;
    }
}
