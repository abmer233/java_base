package com.poly2;

import com.lxyedu.encap.poly.Employee;

public class Test {
    public static void main(String[] args) {
        Worker aaa = new Worker("Jack",2000.0,500);
        Manage manage = new Manage("Milan",8000.0,50000.0);
        Test test = new Test();
        test.showEmpAnnual(aaa);
    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
}
