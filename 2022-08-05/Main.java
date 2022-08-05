package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8 ,9};
        reverseArray(arr, 3);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void reverseArray(int[] arr, int size){
        if(size > arr.length) return;

        for(int i = 0; i < arr.length; i += size){
            int end = (i + size < arr.length) ? i + size - 1 : arr.length - 1;
            for(int j = i; j < end; j++){
                int tmp = arr[end];
                arr[end] = arr[j];
                arr[j] = tmp;
                end--;
            }
        }
    }
}
