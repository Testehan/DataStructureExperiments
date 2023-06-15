package com.testehan.datastructures.list.singlelinkedlist;

class MainCircularSinglyLinkedList {
  public static void main(String[] args) {
    CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
    csll.createCircularSinglyLinkedList(5);
    csll.insert(4, 0);
    csll.insert(6, 1);
    csll.insert(7, 8);
    csll.traverse();
    csll.deleteCircularSinglyLinkedList();
    csll.traverse();

  }
}
