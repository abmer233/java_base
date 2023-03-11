package com.lxyedu.encap.Exercise02;

import com.lxyedu.encap.Override.Person;

public class Honework002 {
    public static void main(String[] args) {
    }
}
interface Vehicle{
    public void work();
}
class Horse implements Vehicle{
    @Override
    public void work() {
        System.out.println("用吗走");
    }
}
class Boat implements  Vehicle{
    @Override
    public void work() {
        System.out.println("用船走");
    }
}
class VehicleTools{
    public static Boat method01(){
       return new Boat();
    }
    public static Horse method02(){
        return new Horse();

    }
}
class person{
    private String name;
    private Vehicle vehicle;

    public person(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }
    public void passRiver(){
       Boat boat = VehicleTools.method01();
        boat.work();
    }
    public void common(){
        Horse horse = VehicleTools.method02();
        horse.work();
    }
}