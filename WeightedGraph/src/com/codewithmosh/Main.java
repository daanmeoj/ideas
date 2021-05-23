package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var graph=new WeightedGraph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A","B",1);
        graph.addEdge("B","C",2);
        graph.addEdge("A","C",10);
        var path=graph.getShortestPath("A","C");
        System.out.println(path);
//        graph.addNode("D");
//        graph.addNode("E");
//        graph.addEdge("A","C",4);
//        graph.addEdge("A","B",3);
//        graph.addEdge("A","D",2);
//        graph.addEdge("C","D",1);
//        graph.addEdge("B","D",6);
//        graph.addEdge("B","E",1);
//        graph.addEdge("D","E",5);
//        System.out.println(graph.getShortestPath("A","E"));
    }
}
