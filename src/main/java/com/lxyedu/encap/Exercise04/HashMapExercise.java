package com.lxyedu.encap.Exercise04;

import java.util.*;

public class HashMapExercise {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("001",new Employee("小王",19000,"9527"));
        hashMap.put("002",new Employee("小明",1000,"9528"));
        hashMap.put("003",new Employee("小张",13000,"9529"));
        Set set = hashMap.keySet();
        for (Object key :set) {
            Employee employee = (Employee)hashMap.get(key);
            if (employee.getSalary() > 10000){
                System.out.println(employee);
            }
        }
        Set entrySet = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry) iterator.next();
            Employee employee = (Employee) entry.getValue();
            if (employee.getSalary() > 10000){
                System.out.println(employee);
            }
        }
        
    }
}
class Employee{
    private String name;
    private double salary;
    private String emp_id;

    public Employee(String name, double salary, String emp_id) {
        this.name = name;
        this.salary = salary;
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", emp_id='" + emp_id + '\'' +
                '}';
    }
}
