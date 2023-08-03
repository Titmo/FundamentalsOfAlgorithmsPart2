package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringListImpl stringList = new StringListImpl(1000);
        for (int i = 0; i < 1 ; i++) {
            stringList.add(3);
            stringList.add(1);
            stringList.add(7);
            stringList.add(2);
            stringList.add(5);
            stringList.add(7);
            stringList.add(7);
            stringList.add(8);
        }

        System.out.println("stringList.lastIndexOf(1) = " + stringList.indexOf(1));
        System.out.println("stringList.toArray() = " + Arrays.toString(stringList.toArray()));
        long start = System.currentTimeMillis();
        stringList.sort();

        System.out.println(System.currentTimeMillis() - start);
        System.out.println("stringList.toArray() = " + Arrays.toString(stringList.toArray()));
        System.out.println("stringList.containsBin(5) = " + stringList.containsBin(8));
    }
}