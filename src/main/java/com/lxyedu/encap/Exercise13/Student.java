package com.lxyedu.encap.Exercise13;

public class Student extends Person{
    private String  stu_id;

    public Student(String name, char sex, int age,String hobby, String stu_id) {
        super(name, sex, age,hobby);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
    public String StudentMethod(){
        return "我承诺，我会好好学习";
    }

    @Override
    public String play() {

        return super.play();
    }
    public String printInfoStudent(){
        return method01() + "\n" + StudentMethod() + "\n" ;
    }
}
