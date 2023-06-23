package com.testehan.datastructures.stack;

import java.util.LinkedList;
import java.util.List;

public class StackLinkedList {
    private List<Integer> linkedList;

    public StackLinkedList() {
        linkedList = new LinkedList<>();
    }

    public void push(int value) {
        linkedList.add(0, value);
        System.out.println("Inserted " + value + " in Stack");
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public int pop() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("The Stack is Empty!");
        } else {
            result = linkedList.remove(0);
        }
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The Stack is Empty!");
            return -1;
        } else {
            return linkedList.get(0);
        }
    }

    public void deleteStack() {
        linkedList = null;
        System.out.println("The Stack is deleted");
    }
}
