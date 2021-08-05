package com.codewithmosh.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void show(){
        var c1=new Customer("a","e1");
        var c2=new Customer("b","e2");
        Map<String,Customer> map=new HashMap<>();
        map.put(c1.getEmail(),c1);
        map.put(c2.getEmail(),c2);
        var customer=map.get("e1");
        System.out.println(customer);
        var unknown=new Customer("unknown","");
        var customer2=map.getOrDefault("e100",unknown);
        System.out.println(customer2);
        var exists=map.containsKey("e2");
        System.out.println(exists);
        map.replace("e1",new Customer("a++","e1"));
        System.out.println(map.get("e1"));
        System.out.println(map);
        for (var key:map.keySet())
            System.out.println(key);


        for (var entry:map.entrySet())
            System.out.println(entry.getKey()+"-"+entry.getValue());
    }
}
