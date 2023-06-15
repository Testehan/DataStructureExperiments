package com.testehan.datastructures.list.singlelinkedlist;

class MainSinglyLinkedList {
  public static void main(String[] args) {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.createSinglyLinkedList(5);
    // System.out.println(linkedList.head.value);
    linkedList.insertInLinkedList(6, 1);
    linkedList.insertInLinkedList(7, 3);
    linkedList.insertInLinkedList(8, 4);
    linkedList.insertInLinkedList(9, 0);
    linkedList.traverseSinglyLinkedList();
    linkedList.deletionOfNode(2);
    linkedList.traverseSinglyLinkedList();
    linkedList.deleteSingleLinkedList();
    linkedList.traverseSinglyLinkedList();

  }
}
