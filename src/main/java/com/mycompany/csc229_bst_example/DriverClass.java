/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc229_bst_example;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
    public static void main(String a[]) {
 
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(8);
        bst.insert(10);
        bst.insert(14);
        bst.insert(3);
        bst.insert(6);
        bst.insert(7);
        bst.insert(1);
        bst.insert(4);
        bst.insert(13);
        System.out.println("\nPreOrderTraversal");
        bst.preOrderTraversal();
        System.out.println("In Order Traversal");
        bst.inOrderTraversal();
        System.out.print("\nHeight of the tree: " + bst.findHeight());       
        bst.print("",  false);
    }
    public void inOrderTraversal(){
        System.out.print("InOrderTraversal: ");    //InOrderTraversal Method
        System.out.println();                   
    }
    private void doInOrder(BstNode root){
if(root==null){
}
doInOrder(root.getLeft());
System.out.print(root.getData() + " "); // Get Data for Root
doInOrder(root.getRight());
}
    public void preOrderTraversal(){
        System.out.print("PreOrder Traversal: ");     // PreOrder Traversal Method
        System.out.println();
    }
    private void doPreOrder(BstNode root){
        if(root==null){
            return;
        }             
        // Add in return statement
    }
    public int getDepth(BstNode node, int par){
        return getDepth(node, 0);
    }
    private int getDepth(BstNode root, BstNode node, int depth){
        if(root==null){
            return -1;
        }
        return 0;
    }
public void print(String string, boolean par){
    print("", false);
}
private void print(String prefix, BstNode node, boolean isLeft){
    if(node != null){
        System.out.println(node.getData);
        
    }
}
}



