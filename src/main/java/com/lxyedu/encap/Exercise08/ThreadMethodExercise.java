package com.lxyedu.encap.Exercise08;

public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        Thread thread = new Thread(t1);
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
            if (i == 5){
                thread.start();
                thread.join();
            }
        }
        Thread.sleep(1000);
    }
}
class T1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("线程T1退出");
    }
}
