package com.codewithmosh;

public class AVLTree {
    private class AVLNode{
        private int height;
        private int value;
        private AVLNode leftChild;
        private AVLNode rightChild;

        public AVLNode(int value){
            this.value=value;
        }
        @Override
        public String toString(){
            return "Value="+this.value;
        }
    }
        private AVLNode root;

        public void insert(int value){
            root=insert(root,value);
        }

        private AVLNode insert(AVLNode root, int value){
            if(root==null)
                return new AVLNode(value);
            if(value<root.value)
                root.leftChild=insert(root.leftChild,value);
            else
                root.rightChild=insert(root.rightChild,value);

            setHeight(root);

            return balance(root);
        }

        private AVLNode balance(AVLNode root){
            if(isleftHeavy(root)){
                if(balancefactor(root.leftChild)<0)
                    root.leftChild=rotateLeft(root.leftChild);
                return rotateRight(root);
            }
            else if(isRightHeavy(root)){
                if(balancefactor(root.rightChild)>0)
                    root.rightChild=rotateRight(root.rightChild);
                return rotateLeft(root);
            }
            return root;
        }

        private AVLNode rotateLeft(AVLNode root){
            var newRoot=root.rightChild;
            root.rightChild=newRoot.leftChild;
            newRoot.leftChild=root;

            setHeight(root);
            setHeight(newRoot);

            return newRoot;
        }

    private AVLNode rotateRight(AVLNode root){
        var newRoot=root.leftChild;
        root.leftChild=newRoot.rightChild;
        newRoot.rightChild=root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

        private int height(AVLNode node){
            return (node==null)?-1:node.height;
        }

        private void setHeight(AVLNode node){
            node.height=Math.max(
                    height(node.leftChild),
                    height(node.rightChild))+1;
        }

        private boolean isleftHeavy(AVLNode node){
            return balancefactor(node)>1;
        }

        private boolean isRightHeavy(AVLNode node){
            return balancefactor(node)<-1;
        }

        private int balancefactor(AVLNode node){
            return (node==null)?0:height(node.leftChild)-height(node.rightChild);
        }

}
