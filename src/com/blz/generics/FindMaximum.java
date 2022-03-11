package com.blz.generics;

public class FindMaximum {
    public static void main(String[] args) {

        System.out.println("Welcome to the Program");
        FindMaximum findMaximum = new FindMaximum();
        System.out.println("Maximum number is : " + findMaximum.findMaxFlotValue("Apple", "Peach", "Banana"));
    }

    public String findMaxFlotValue ( String String1, String String2, String String3)
        {
            if (String1.compareTo(String2) > 0 && String1.compareTo(String3) > 0) {
                return String1;
            }
         else if (String2.compareTo(String3) > 0 && String2.compareTo(String1) > 0) {

            return String2;
        } else {

            return String3;
        }
    }
}