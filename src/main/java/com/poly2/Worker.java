package com.poly2;

import com.lxyedu.encap.poly.Employee;

public class Worker extends Employee {
    private double work;

    public Worker(String name, double salary, double work) {
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
        return super.getAnnual() + work;
    }
}
