package com.testehan.collectionsframework.implementations.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListMain {

    public static void main(String[] args) {
        firstExamples();

        usingLinkedListAsQueue();
        usingLinkedListAsStack();
    }

    private static void firstExamples() {
        LinkedList<String> list = new LinkedList<>();

        list.add("apple");
        list.add("banana");
        list.add("mango");
        list.add("apple");
        list.add("cherry");
        list.add("grapes");

        System.out.println(list);
        list.add(1,"watermelon");
        System.out.println(list);
        list.addFirst("lemon");
        list.addLast("orange");
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(4));

        System.out.println("size " + list.size());
        for (String fruit:list){
            System.out.print(fruit + " ");
        }

        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list.remove(2));
        System.out.println(list.remove("apple"));
        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }

    private static void usingLinkedListAsQueue() {
        Queue<String> list = new LinkedList<>();

        list.add("apple");
        list.add("banana");
        list.add("mango");
        list.add("apple");
        list.add("cherry");
        list.add("grapes");

        list.remove();

        System.out.println(" ");
        System.out.println(list);

        System.out.println( list.peek());
    }

    private static void usingLinkedListAsStack() {
        LinkedList<String> list = new LinkedList<>();

        list.add("apple");
        list.add("banana");
        list.add("mango");
        list.add("apple");
        list.add("cherry");
        list.add("grapes");

        list.removeLast();

        System.out.println(" ");
        System.out.println(list);

        System.out.println( list.peekLast());
    }
}
