package com.lxyedu.encap.Exercise06;

import java.util.*;

public class Homework006 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack",650);
        m.put("tom",1200);
        m.put("smith",2900);
        System.out.println(m);
        m.put("jack",2600);
        System.out.println(m);
        Set keySet = m.keySet();
        for (Object key :keySet) {
            m.put(key,(Integer)m.get(key)+100);
        }
        System.out.println(m);
        Set entrySet = m.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry next =  (Map.Entry)iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }
    }
}
