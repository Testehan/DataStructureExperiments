package com.testehan.datastructures.queue;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class QueueExperiments {

    public static void main(String[] args) {
//        queueStuff();

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("red");
        linkedList.add("blue");

        ListIterator<String> colorIterator = linkedList.listIterator();
        while (colorIterator.hasNext()){
            System.out.println(colorIterator.next());
        }

    }

    private static void queueStuff() {
        Queue<String> colors = new LinkedList<>();

        colors.add("red");
        colors.add("blue");
        colors.add("black");

        System.out.println(colors.peek());
        System.out.println(colors.poll());
        System.out.println(colors.size());
    }
}
