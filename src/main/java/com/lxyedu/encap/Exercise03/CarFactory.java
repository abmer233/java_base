package com.lxyedu.encap.Exercise03;

public class CarFactory {
    public static void main(String[] args) {
        Car car = new Car(60);
        car.getair().flow();
    }
}
class Car{
    private double tem;

    public Car(double tem) {
        this.tem = tem;
    }

    public class air{
        public void flow(){
            if (tem > 40){
                System.out.println("空调吹冷气，温度大四十");
            } else if (tem < 0) {
                System.out.println("空调吹暖气");
            }else {
                System.out.println("温度正常，关闭空调");
            }
        }
    }
    public air getair(){
        return new air();
    }
}
