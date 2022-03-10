package com.blz.generics;

public class PrintArray {

    public static void main(String[] args) {
        Integer intArray[] = {1, 2, 3, 4};
        Double doubleArray[] = {1.2, 2.5, 3.6, 4.1};
        Character charArray[] = {'X', 'Y', 'Z', 'W'};

        PrintArray.toPrint(intArray);
        System.out.println();
        PrintArray.toPrint(doubleArray);
        System.out.println();
        PrintArray.toPrint(charArray);
        System.out.println();
    }

    private static void toPrint(Integer[] array) {
        for (Integer value : array) {
            System.out.print(value + " ");
        }
    }

    private static void toPrint(Double[] array) {
        for (Double value : array) {
            System.out.print(value + " ");
        }
    }

    private static void toPrint(Character[] array) {
        for (Character value : array) {
            System.out.print(value + " ");
        }
    }
}

