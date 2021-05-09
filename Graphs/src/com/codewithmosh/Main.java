package com.codewithmosh;

import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        var graph=new Graph();
        var graphRev=new Graph();

        try{
            BufferedReader br=new BufferedReader(
                    new FileReader( "/home/davidmercado/IdeaProjects/Graphs/input/test1.txt"));

            BufferedWriter bw=new BufferedWriter(
                    new FileWriter("/home/davidmercado/IdeaProjects/Graphs/output/log2.txt"));

            String s,tail,head;
            while ((s=br.readLine())!=null){
                tail=s.split(" ")[0];
                head=s.split(" ")[1];
                graph.addNode(tail);
                graph.addNode(head);
                graph.addEdge(tail,head);

            }


            System.out.println(graph.hasCycle());

            br.close();
            bw.close();
        }catch(Exception ex){
            System.out.println(ex);
            return;
        }


    }
}
