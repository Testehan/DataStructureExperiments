package com.testehan.collectionsframework.interfaces.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue();

        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.add("e");

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.offer("a"));
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.add("a");
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue);
    }
}
