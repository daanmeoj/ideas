package com.codewithmosh;

import java.util.Arrays;

public class PriorityQueue {
    private int[] items;
    private int count,R,F;

    public PriorityQueue(int capacity) {
        // TODO Auto-generated constructor stub
        items=new int[capacity];
        F=0;
        R=0;
    }

    public void add(int item) {
        if(isFull())
            throw new IllegalStateException();
        int i=shiftItemsToInsert(item);
        items[i]=item;
        count++;
    }

    public int remove() {
        if(count==0)
            throw new IllegalStateException();
        return items[--count];
    }


    public boolean isEmpty() {
        return count==0;
    }

    public void print() {

        for(int i=F;i<R;i++) {
            System.out.println(items[i]);
        }

    }

    @Override
    public String toString() {
        int[] content= Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }

    public int shiftItemsToInsert(int item) {
        int i;
        for(i=count-1;i>=0;i--) {
            if(item<items[i])
                items[i+1]=items[i];
            else
                break;
        }
        return i+1;
    }

    public boolean isFull() {
        return count==items.length;
    }
}
