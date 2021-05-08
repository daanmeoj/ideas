package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tree tree=new Tree();
        tree.insert(7);
//        tree.insert(4);
//        tree.insert(9);
//        tree.insert(1);
//        tree.insert(6);
//        tree.insert(8);
//        tree.insert(10);
        //tree.swap();
        //System.out.println(tree.isBinarySearchTree());
//        var list=tree.getNodesAtDistance(2);
//        for(var item:list)
//            System.out.println(item);
        //tree.traverseInOrder();
        //tree.traversePostOrder();
        //System.out.println(tree.height());
       // System.out.println(tree.min());
        tree.traverseLevelOrder();
    }
}
