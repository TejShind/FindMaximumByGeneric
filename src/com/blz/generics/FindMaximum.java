package com.blz.generics;

public class FindMaximum {
    public static void main(String[] args) {

        System.out.println("Welcome to the Program");
        int firstValue = 22;
        int secondValue = 10;
        int thirdValue = 54;
        if (firstValue >= secondValue && firstValue >= thirdValue)
            System.out.println(firstValue + " Maximum number is");
        else if (secondValue >= firstValue && secondValue >= thirdValue)
            System.out.println(secondValue + " Maximum number is");
        else
            System.out.println(thirdValue + " Maximum number is");
    }
}