package com.codewithmosh.collections;

import java.util.*;

public class SetDemo {
    public static void show(){
        Collection<String> collection=new ArrayList<>();
        Collections.addAll(collection,"a","b","c","c");
        Set<String> set=new HashSet<>(collection);
        System.out.println(set);
        Set<String> set1=new HashSet<>(Arrays.asList("a","b","c"));
        Set<String> set2=new HashSet<>(Arrays.asList("b","c","d"));
        //set1.addAll(set2);
        //System.out.println(set1);
        //intersection
        //set1.retainAll(set2);
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
