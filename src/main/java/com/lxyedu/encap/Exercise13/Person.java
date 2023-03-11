package com.lxyedu.encap.Exercise13;

public class Person {
    private String name;
    private char sex;
    private int age;
    private String hobby;

    public Person(String name, char sex, int age, String hobby) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.hobby = hobby;

    }

    public String gethobby() {
        return hobby;
    }

    public void sethobby(String hobby) {
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String method01() {
        return getName() + "的信息:" + "\n" + "姓名:" + getName() + "\n" + "年龄:" + getAge();
    }

    public String play() {
        return getName() + "爱玩足球" + gethobby();
    }
}
