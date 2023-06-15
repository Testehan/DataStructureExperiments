package com.testehan.datastructures.list.singlelinkedlist;

public class CircularSinglyLinkedList {
  public Node head;
  public Node tail;
  public int size;

  public Node createCircularSinglyLinkedList(int nodeValue) {
    head = new Node();
    Node node = new Node();
    node.value = nodeValue;
    node.next = node;
    head = node;
    tail = node;
    size = 1;
    return head;
  }
  //  Insertion Method
  public void insert(int nodeValue, int location) {
    Node node = new Node();
    node.value = nodeValue;
    if (head == null) {
      createCircularSinglyLinkedList(nodeValue);
      return;
    } else if (location == 0) {
      node.next = head;
      head = node;
      tail.next = head;
    } else if (location >= size) {
      tail.next = node;
      tail = node;
      tail.next = head;
    } else {
      Node tempNode = head;
      int index = 0;
      while (index < location-1) {
        tempNode = tempNode.next;
        index++;
      }
      node.next = tempNode.next;
      tempNode.next = node;
    }
    size++;
  }

  // Traversal Method
  public void traverse() {
    if (head != null) {
      Node tempNode = head;
      for (int i=0; i<size; i++) {
        System.out.print(tempNode.value);
        if (i != size-1) {
          System.out.print(" -> ");
        }
        tempNode = tempNode.next;
      }
      System.out.println("\n");
    } else {
      System.out.println("CircularSinglyLinkedList does not exist!");
    }
  }

  // Search Method

  public boolean searchNode(int nodeValue) {
    if (head != null) {
      Node tempNode = head;
      for(int i =0; i<size; i++) {
        if (tempNode.value == nodeValue) {
          System.out.print("Found node at location: " + i);
          return true;
        }
        tempNode = tempNode.next;
      }
    }
    System.out.println("Node not found! ");
    return false;
  }

  // Delete Method

  public void deleteNode(int location) {
    if (head == null) {
      System.out.println("The CircularSinglyLinkedList does not exist! ");
      return;
    } else if (location == 0) {
      head = head.next;
      tail.next = head;
      size--;
      if (size == 0) {
        tail = null;
        head.next = null;
        head = null;
      }
    } else if (location >= size) {
      Node tempNode = head;
      for (int i =0; i<size-1; i++) {
        tempNode = tempNode.next;
      }
      if (tempNode == head) {
        head.next = null;
        tail = head = null;
        size--;
        return;
      }
      tempNode.next = head;
      tail = tempNode;
      size--;
    } else {
      Node tempNode = head;
      for (int i=0; i < location-1; i++) {
        tempNode = tempNode.next;
      }
      tempNode.next = tempNode.next.next;
      size--;
    }
  }

  // Delete CSLL
  public void deleteCircularSinglyLinkedList() {
    if (head == null) {
      System.out.println("The CircularSinglyLinkedList does not exist!");
    } else {
      head = null;
      tail.next = null;
      tail = null;
      System.out.println("The CircularSinglyLinkedList has been deleted!");
    }
  }




}
