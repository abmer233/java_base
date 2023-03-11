package com.user.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise220 {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello" + i);
        }
        System.out.println("list=" + list);
        list.add(1,"韩顺平教育");
        list.get(4);
        list.remove(5);
        list.set(6,"diaoda");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
