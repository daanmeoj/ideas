package com.codewithmosh;

import com.codewithmosh.collections.Customer;
import com.codewithmosh.collections.EmailComparator;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Queue<String>queue=new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        queue.offer("d");
        System.out.println(queue);
        var front=queue.peek();//null if queue is empty
        var front2=queue.element();//throw exception if queue is empty
        System.out.println(front);
        System.out.println(front2);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
}}
