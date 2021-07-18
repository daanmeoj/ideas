package com.codewithmosh.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void show(){
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0,"!");
        Collections.addAll(list,"aa","bb","cc");
        System.out.println(list);
        list.set(0,"+a");
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.indexOf("aa"));
        list.add("c");
        System.out.println(list);
        System.out.println(list.lastIndexOf("c"));
        System.out.println(list.subList(0,2));
    }
}
