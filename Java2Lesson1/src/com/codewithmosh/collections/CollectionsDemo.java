package com.codewithmosh.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show(){
        Collection<String> collection=new ArrayList<>();
        Collections.addAll(collection,"a","b","c");
        collection.remove("a");
        System.out.println(collection.contains("b"));
        var objectArray=collection.toArray();
        var stringArray=collection.toArray(new String[0]);
        System.out.println(collection);
        System.out.println(collection.size());
        Collection<String> other=new ArrayList<>();
        other.addAll(collection);
        System.out.println(collection==other);
        System.out.println(collection.equals(other));
    }
}
