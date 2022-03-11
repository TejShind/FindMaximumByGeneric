package com.blz.generics;

public class FindMaximum {
    public static void main(String[] args) {

        System.out.println("Welcome to the Program");
        FindMaximum findMaximum = new FindMaximum();
        System.out.println("Maximum number is : " + findMaximum.findMaxFlotValue(2.3, 26.3, 8.6));
    }

    public double findMaxFlotValue ( Double firstValue, Double secondValue, Double thirdValue)
        {
            if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0) {
                return firstValue;
            }
         else if (secondValue.compareTo(thirdValue) > 0 && secondValue.compareTo(firstValue) > 0) {
            return secondValue;
        } else {
            return thirdValue;
        }
    }
}