package com.lxyedu.encap.poly;

public class Leader extends Employee{
    private double bonus;
    private double manage;

    public Leader(String name, double salary, double bonus, double manage) {
        super(name, salary);
        this.bonus = bonus;
        this.manage = manage;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getManage() {
        return manage;
    }

    public void setManage(double manage) {
        this.manage = manage;
    }

    @Override
    public double getAnnual() {
        return (super.getAnnual() + bonus + manage);
    }
}
