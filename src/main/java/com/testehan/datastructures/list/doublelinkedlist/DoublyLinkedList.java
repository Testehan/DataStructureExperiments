package com.testehan.datastructures.list.doublelinkedlist;

public class DoublyLinkedList {
  DoublyNode head;
  DoublyNode tail;
  int size;

  public DoublyNode createDLL(int nodeValue) {
    head = new DoublyNode();
    DoublyNode newNode = new DoublyNode();
    newNode.value = nodeValue;
    newNode.next = null;
    newNode.prev = null;
    head = newNode;
    tail = newNode;
    size = 1;
    return head;
  }

  // Insertion Method
  public void insertDLL(int nodeValue, int location) {
    DoublyNode newNode = new DoublyNode();
    newNode.value = nodeValue;
    if (head == null) {
      createDLL(nodeValue);
      return;
    } else if (location == 0) {
      newNode.next = head;
      newNode.prev = null;
      head.prev = newNode;
      head = newNode;
    } else if (location >= size) {
      newNode.next = null;
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    } else {
      DoublyNode tempNode = head;
      int index = 0;
      while (index < location-1) {
        tempNode = tempNode.next;
        index++;
      }
      newNode.prev = tempNode;
      newNode.next = tempNode.next;
      tempNode.next = newNode;
      newNode.next.prev = newNode;
    }
    size++;
  }

  //Traverse DLL
	public void traverseDLL() {
    if (head != null) {
      DoublyNode tempNode = head;
      for (int i = 0; i < size; i++) {
        System.out.print(tempNode.value);
        if (i != size-1) {
          System.out.print(" -> ");
        }
        tempNode = tempNode.next;
      }
    } else {
      System.out.println("The DLL does not exist!");
    }
    System.out.println("\n");
  }

  // Reverse Traverse
  public void reverseTraverseDLL() {
    if (head != null) {
      DoublyNode tempNode = tail;
      for (int i = 0; i < size; i++) {
        System.out.print(tempNode.value);
        if (i != size-1) {
          System.out.print(" <- ");
        }
        tempNode = tempNode.prev;
      }
    } else {
      System.out.println("The DLL does not exist!");
    }
    System.out.println("\n");
  }

  // Search Node
  public boolean searchNode(int nodeValue) {
    if (head != null) {
      DoublyNode tempNode = head;
      for (int i = 0; i < size; i++) {
        if (tempNode.value == nodeValue) {
          System.out.print("The Node is found at location: " +i);
          return true;
        }
        tempNode = tempNode.next;
      }
    }
    System.out.print("Node not found!");
    return false;
  }

  // Deletion Method
  public void deleteNodeDLL(int location) {
    if (head == null) {
      System.out.println("The DLL does not exist!");
    } else if (location == 0) {
      if (size == 1) {
        head = null;
        tail = null;
        size--;
      } else {
        head = head.next;
        head.prev = null;
        size--;
      }
    } else if (location >= size) {
      DoublyNode tempNode = tail.prev;
      if (size == 1) {
        head = null;
        tail = null;
        size--;
        } else {
          tempNode.next = null;
          tail = tempNode;
          size--;
        }
    } else {
      DoublyNode tempNode = head;
      for (int i = 0; i < location-1; i++) {
        tempNode = tempNode.next;
      }
      tempNode.next = tempNode.next.next;
      tempNode.next.prev = tempNode;
      size--;
    }
  }

  // Delete entire DLL
  /*
    this is how this operation is performed in LinkedList from java.util
    // Clearing all of the links between nodes is "unnecessary", but:
    // - helps a generational GC if the discarded nodes inhabit
    //   more than one generation
    // - is sure to free memory even if there is a reachable Iterator

      for (Node<E> x = first; x != null; ) {
            Node<E> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
   */
  public void deleteDLL() {
    DoublyNode tempNode = head;
    for (int i =0; i< size; i++) {
      tempNode.prev = null;
      tempNode = tempNode.next;
    }
    head = null;
    tail = null;
    System.out.println("The DLL has been deleted!");
  }



}
