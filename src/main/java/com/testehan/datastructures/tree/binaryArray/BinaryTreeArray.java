package com.testehan.datastructures.tree.binaryArray;

// this array will only be used with index starting from 1, even though arrays start from 0, because this will simplify
// our job. The root is on position 1. then each child will be at:
//  left child - position  -> 2*rootPosition
//  right child - position -> 2*rootPosition + 1

// using the above strategy means that even indexes corespond to left childs, while odd indexes corespond to right childs

public class BinaryTreeArray {
  String[] arr;
  int lastUsedIndex;

  public BinaryTreeArray(int size) {
    arr = new String[size+1];
    this.lastUsedIndex=0;       // we will never store anything in index 0
    System.out.println("Blank Tree of size " +size+ " has been created");
  }

  // isFull
  boolean isFull() {
    if (arr.length-1 == lastUsedIndex) {    // -1 because we don't use index "0"
      return true;
    } else {
      return false;
    }
  }

  // insert method

  void insert( String value) {
    if (!isFull()) {
      arr[lastUsedIndex+1] =value;
      lastUsedIndex++;
      System.out.println("The value of "+value+" has been inserted");
    } else {
      System.out.println("The BT is full");
    }
  }

  // preOrder Traversal
  public void preOrder(int indexRootNode) {
    if (indexRootNode > lastUsedIndex) {
      return;
    }
    System.out.print(arr[indexRootNode]+ " ");
    preOrder(indexRootNode * 2);
    preOrder(indexRootNode * 2 + 1);
  }

  // InOrder Traversal
  public void inOrder(int indexRootNode) {
     if (indexRootNode > lastUsedIndex) {
      return;
    }
    inOrder(indexRootNode * 2);
    System.out.print(arr[indexRootNode] + " ");
    inOrder(indexRootNode * 2 + 1);

  }

  // Post Order Traversal
  public void postOrder(int indexRootNode) {
    if (indexRootNode > lastUsedIndex) {
      return;
    }
    postOrder(2 * indexRootNode);
    postOrder(2 * indexRootNode + 1);
    System.out.print(arr[indexRootNode] + " ");
  }

  // Level Order Traversal
  public void levelOrder() {
    for (int i = 1; i<=lastUsedIndex; i++) {
      System.out.print(arr[i]+ " ");
    }
  }

  // Search method
  public int search(String value) {
    for (int i = 1; i<=lastUsedIndex; i++) {
      if (arr[i] == value) {
        System.out.println(value+" exists at the location: " + i);
        return i;
      }
    }
    System.out.println("The value does not exist in BT");
    return -1;
  }

  // Delete Method
  public void delete(String value) {
    int location = search(value);
    if (location == -1) {
      return;
    } else {
      arr[location] = arr[lastUsedIndex];
      lastUsedIndex--;
      System.out.println("The node successfully deleted");
    }
  }

  // Delete BT

  public void deleteBT() {
    try {
      arr = null;
      System.out.println("The BT has been successfully deleted");

    } catch (Exception e){
      System.out.println("There was an error deleting the tree");
    }
  }






}
