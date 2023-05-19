package com.testehan.collectionsframework.implementations.array;

public class ArrayMain {

    public static void main(String[] args) {
        arrayOfDifferentAnimals();

        arrayCanOnlyContainElementsOfTheDefinedType();

        arrayOfObjectsContainsAllSortOfObjects();

    }

    private static void arrayOfObjectsContainsAllSortOfObjects() {
        Object[] objects = new Object[5];
        objects[0] = "abc";
        objects[1] = Integer.valueOf("32");
        objects[2] = new Dog();
    }

    private static void arrayCanOnlyContainElementsOfTheDefinedType() {
        String[] strings = new String[5];
        strings[0] = "abc";
//        strings[1] = new Dog(); // compilation error
    }

    private static void arrayOfDifferentAnimals() {
        Animal[] animals = new Animal[5];

        animals[0] = new Dog();
        animals[1] = new Cat();

        animals[0].sound();
        animals[1].sound();
    }
}
