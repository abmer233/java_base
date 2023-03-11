package com.lxyedu.encap.Exercise13;

public class Teacher extends Person{
    private String work_age;

    public Teacher(String name, char sex, int age,String hobby,String work_age) {
        super(name, sex, age,hobby);
        this.work_age = work_age;
    }

    public String getWork_age() {
        return work_age;
    }

    public void setWork_age(String work_age) {
        this.work_age = work_age;
    }
    public void TeacherMethod(){
        System.out.println("我承诺，我会认真教学");
    }

    @Override
    public String play() {
        return super.play();
    }
}
