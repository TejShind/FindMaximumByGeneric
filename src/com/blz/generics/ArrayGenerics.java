package com.blz.generics;

public class ArrayGenerics {

    private static <M> void toPrint(M[] Array) {
        for (M value : Array) {
            System.out.print(value + ",");
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        Double[] doubleArray = {1.2, 2.5, 3.6, 4.1};
        Character[] charArray = {'X', 'Y', 'Z', 'W'};
        ArrayGenerics.toPrint(intArray);
        System.out.println();
        ArrayGenerics.toPrint(doubleArray);
        System.out.println();
        ArrayGenerics.toPrint(charArray);
    }
}