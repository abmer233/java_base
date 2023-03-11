package com.lxyedu.encap.enum_;

public class Exercise01 {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        for(Week week:weeks){
            System.out.println(week);
        }
    }
}
