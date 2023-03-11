package com.lxyedu.encap.Override;

public class test {
    public static void main(String[] args) {
        Person person = new Person("李明",18);
        System.out.println(person.say());
        Student student = new Student("鸟人",8222,"9527",101.0);
        student.info();

    }
}
