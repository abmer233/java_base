package com.lxyedu.encap.Exercise01;

public class exe {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testwork(new Calculata() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },10,8);
    }
}
interface Calculata{
    public double work(double n1,double n2);
}
class Cellphone{
    public void testwork(Calculata calculata,double n1,double n2){
       double result = calculata.work(n1, n2);
        System.out.println("计算后的结果是" + result);
    }
}