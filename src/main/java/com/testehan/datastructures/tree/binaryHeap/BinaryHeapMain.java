package com.testehan.datastructures.tree.binaryHeap;

public class BinaryHeapMain {

    public static void main(String[] args) {
        BinaryHeap binaryHeap = new BinaryHeap(5);

        binaryHeap.insert(10,BinaryHeap.MIN);
        binaryHeap.insert(100,BinaryHeap.MIN);
        binaryHeap.insert(50,BinaryHeap.MIN);
        binaryHeap.insert(30,BinaryHeap.MIN);
        binaryHeap.insert(80,BinaryHeap.MIN);
        binaryHeap.levelOrder();
    }
}
