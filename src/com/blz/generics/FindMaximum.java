package com.blz.generics;

public class FindMaximum {
    public static void main(String[] args) {

        System.out.println("Welcome to the Program");
        FindMaximum findMaximum = new FindMaximum();
        System.out.println("Maximum number is : " + findMaximum.findMaxIntValue(22, 3, 6));
    }
        public int findMaxIntValue ( Integer firstValue, Integer secondValue, Integer thirdValue)
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

//        if (firstValue >= secondValue && firstValue >= thirdValue)
//            System.out.println(firstValue + " Maximum number is");
//        else if (secondValue >= firstValue && secondValue >= thirdValue)
//            System.out.println(secondValue + " Maximum number is");
//        else
//            System.out.println(thirdValue + " Maximum number is");
