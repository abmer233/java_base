package com.lxyedu.encap.Exercise05;

import java.util.ArrayList;

public class Homework005 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car = new Car("宝马",400000);
        Car car1 = new Car("宾利",456000);
        arrayList.add(car);
        arrayList.add(car1);
        System.out.println(arrayList);
        arrayList.remove(car);
        System.out.println(arrayList);
        arrayList.contains(car1);
        System.out.println(arrayList.contains(car1));
        System.out.println(arrayList.size());
        arrayList.addAll(arrayList);
        System.out.println(arrayList);
        arrayList.containsAll(arrayList);
        System.out.println(arrayList);
        arrayList.removeAll(arrayList);
        System.out.println(arrayList);
    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
