package com.testehan.datastructures.tree.binaryArray;

public class BinaryTreeArrayMain {

    public static void main(String[] args) {
        BinaryTreeArray binaryTree = new BinaryTreeArray(9);

        binaryTree.insert("n1");
        binaryTree.insert("n2");
        binaryTree.insert("n3");
        binaryTree.insert("n4");
        binaryTree.insert("n5");
        binaryTree.insert("n6");
        binaryTree.insert("n7");
        binaryTree.insert("n8");
        binaryTree.insert("n9");

        binaryTree.preOrder(1);
        System.out.println(" ");
        binaryTree.inOrder(1);
        System.out.println(" ");
        binaryTree.postOrder(1);
        System.out.println(" ");
        binaryTree.levelOrder();

        System.out.println(" ");
        binaryTree.search("n6");
    }
}
