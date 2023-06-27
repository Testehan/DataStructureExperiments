package com.testehan.datastructures.tree.binarySearchTree;

public class BinarySearchTreeMain {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(70);
        binarySearchTree.insert(50);
        binarySearchTree.insert(90);
        binarySearchTree.insert(30);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);
        binarySearchTree.insert(100);
        binarySearchTree.insert(20);
        binarySearchTree.insert(40);

        binarySearchTree.preOrder(binarySearchTree.root);
        System.out.println(" ");
        binarySearchTree.inOrder(binarySearchTree.root);
        System.out.println(" ");
        binarySearchTree.postOrder(binarySearchTree.root);
        System.out.println(" ");
        binarySearchTree.levelOrder();

        binarySearchTree.deleteNode(binarySearchTree.root,70);
        System.out.println(" ");
        binarySearchTree.levelOrder();

    }
}
