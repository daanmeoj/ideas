package com.codewithmosh;

public class Main {

    public static void main(String[] args) {

        var graph=new Graph();
        graph.addNode("X");
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("P");
        graph.addEdge("X","A");
        graph.addEdge("X","B");
        graph.addEdge("A","P");
        graph.addEdge("B","P");
//        graph.print();
//        graph.traverseDepthFirstRec("A");
//        System.out.println("----");
//        graph.traverseDepthFirst("C");
        graph.print();
        System.out.println(graph.topologicalSort());
    }
}
