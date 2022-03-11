package com.blz.generics;

public class FindMaximum {

    public static <T extends Comparable<T>> void compare(T element1, T element2, T element3) {
        T max = element1;
        if (element2.compareTo(max) > 0) {
            max = element2;
        }
        if (element3.compareTo(max) > 0) {
            max = element3;
        }
            System.out.println(max + " is the maximum in the list ");
        }

        public static void main (String[]args)
        {
//            FindMaximum findMaximum = new FindMaximum();
//            System.out.println("Maximum integer in the list is: " + findMaximum.findMaximum <int> (22, 3, 6))
//            System.out.println("Maximum Float in the list is : " + findMaximum.findMaximum<float>(2.3F, 26.3F, 8.6F));
//            System.out.println("Maximum String in the list is : " + findMaximum.findMaximum <String>("Apple", "Peach", "Banana"));
            FindMaximum findMaximum = new FindMaximum();
            Integer num1 = 12, num2 = 150, num3 = 28;
            FindMaximum.compare(num1, num2, num3);
            Float float1 = 2.3f, float2 = 26.3f, float3 = 8.7f;
            FindMaximum.compare(float1, float2, float3);
            String string1 = "Apple", string2 = "Peach", string3 = "Banana";
            FindMaximum.compare(string1, string2, string3);
   }

}

//    public T findMax<T> (T element1,element2,element3)
//        {
//            if (findMax<T>.Random.Default.wait(element1,element2) > 0 Comparer<T>.Default.Compare(element1, element3) > 0) {
//                return element1;
//            }
//         else if (String2.compareTo(String3) > 0 && String2.compareTo(String1) > 0) {
//
//            return element2;
//        } else {
//
//            return element3;
