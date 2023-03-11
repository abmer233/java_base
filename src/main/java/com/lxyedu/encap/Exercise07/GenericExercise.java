package com.lxyedu.encap.Exercise07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;

public class GenericExercise {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom", 20000, new MyDate(2000, 11, 11)));
        employees.add(new Employee("lxy", 12000, new MyDate(2001, 12, 12)));
        employees.add(new Employee("lxy", 62000, new MyDate(2000, 9, 28)));
        System.out.println(employees);
        System.out.println("==========排序=========");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if (!(emp1 instanceof Employee || emp2 instanceof Employee))
                {
                    System.out.println("类型不正确");
                    return 0;
                }
                int i = emp1.getName().compareTo(emp2.getName());
                if (i != 0){
                    return i;
                }
                int yearMinus = emp1.getBirthday().getYear() - emp2.getBirthday().getYear();
                if (yearMinus != 0){
                    return yearMinus;
                }
                int monthMinus = emp1.getBirthday().getMonth() - emp2.getBirthday().getMonth();
                if (monthMinus != 0){
                    return monthMinus;
                }
                return emp1.getBirthday().getDay() - emp2.getBirthday().getDay();
            }
        });
        System.out.println("=====排序后=========");
        System.out.println(employees);
    }
}
