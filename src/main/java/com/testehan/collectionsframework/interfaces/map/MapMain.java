package com.testehan.collectionsframework.interfaces.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);

        System.out.println(map);

        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("b"));
        System.out.println(map.keySet());
        System.out.println(map.values());

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        map.forEach((k,v)-> System.out.println(k + "->" + v));
    }
}
