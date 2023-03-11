package com.lxyedu.encap.houserent.service;

import com.lxyedu.encap.houserent.domain.House;

public class HouseService {
    private House[] houses;
    private int houseNum = 1;
    private int idCounter = 1;
    public HouseService(int size){
        houses = new House[size];
        houses[0] = new House(1,"kack","112","物理鸥汀",2000,"未出租");
    }
    public House[] list(){
        return houses;
    }
    public boolean add(House newHouse){
        if (houseNum == houses.length){
            System.out.println("数组已满，不能添加");
            return false;
        }
        houses[houseNum++] = newHouse;
        idCounter++;
        newHouse.setId(idCounter);
        return true;
    }
    public boolean del(int delId){




        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (delId == houses[i].getId()){
                index = i;
            }
        }
        if (index == -1){
            return false;
        }
        for (int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[houseNum - 1] = null;
        houseNum--;
        return true;
    }
    public House findById(int findid){
        for (int i = 0; i < houseNum; i++) {
            if (findid == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
}
