package com.codewithmosh;

import java.util.ArrayList;
import java.util.List;

public class Path {

    private List<String> nodes=new ArrayList<>();

    private  int distance=Integer.MAX_VALUE;

    public void add(String node){
        nodes.add(node);
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return nodes.toString();
    }
}
