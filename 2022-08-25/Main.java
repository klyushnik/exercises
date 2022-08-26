package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {2, 3, 4, 7, 9};
        System.out.println(median(a1, a2) + "\n");

        LinkedList[] lists = {
                new LinkedList<Integer>(Arrays.asList(1, 4, 5)),
                new LinkedList<Integer>(Arrays.asList(1, 2, 3)),
                new LinkedList<Integer>(Arrays.asList(2, 6))
        };
        
        LinkedList<Integer> mergedList = mergeLists(lists);
        for(int i : mergedList){
            System.out.print(i + " ");
        }
    }

    public static double median(int[] arr1, int[] arr2){
        double median = 0.0;
        int[] mergedArray = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        //Arrays.sort uses Quicksort and Mergesort algorithms, both of which have complexity of O(n log n).
        Arrays.sort(mergedArray);

        if(mergedArray.length % 2 == 0){
            median = (mergedArray[mergedArray.length / 2] + mergedArray[mergedArray.length / 2 - 1]) / 2.0;
        } else {
            median = mergedArray[mergedArray.length / 2];
        }

        return median;
    }

    public static LinkedList<Integer> mergeLists(LinkedList[] lists){
        LinkedList<Integer> finalList = new LinkedList<>();
        for(LinkedList l : lists){
            finalList.addAll(l);
        }
        Collections.sort(finalList);

        return finalList;
    }
}