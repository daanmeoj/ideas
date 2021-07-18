package com.codewithmosh;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var graph=new WeightedGraph();

        try {
            BufferedReader br=new BufferedReader(
                    new FileReader( "/home/davidmercado/IdeaProjects/WeightedGraph/in/input.txt"));

            String s,tail="",head="",weight="";
            while ((s=br.readLine())!=null){
                var lines=s.split("\\s+");
                for(var line:lines){
                    if(!line.contains(",")){
                        tail=line;
                    }else{
                        head=line.trim().split(",")[0];
                        weight=line.trim().split(",")[1];
                        graph.addNode(tail);
                        graph.addNode(head);
                        graph.addEdge(tail,head,Integer.valueOf(weight));
                    }

                }


            }

            String[] arrayOfNodes={"7","37","59","82","99","115","133","165","188","197"};
            var outputDistances="";
            for(var node:arrayOfNodes)
                outputDistances+=graph.getShortestPath("1",node).getDistance()+",";
            System.out.println(outputDistances.substring(0,outputDistances.length()-1));

        }catch(Exception ex){
            System.out.println(ex.getStackTrace()[0].getLineNumber());
            return;
        }







//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addEdge("A","B",1);
//        graph.addEdge("B","C",2);
//        graph.addEdge("C","A",10);
////        graph.addEdge("A","C",10);
//        var path=graph.getShortestPath("A","C");
//        System.out.println(path.getDistance());
//        System.out.printf(String.valueOf(graph.hasCycle()));
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
