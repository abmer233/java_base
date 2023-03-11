package com.lxyedu.encap.poly;

public class comWorker extends Employee{
   private double work;

    public comWorker(String name, double salary, double work) {
        super(name, salary);
        this.work = work;
    }

    public double getWork() {
        return work;
    }

    public void setWork(double work) {
        this.work = work;
    }

    @Override
    public double getAnnual() {
        return (super.getAnnual() + work);
    }
}
