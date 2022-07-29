package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7};
        System.out.println(largestGap(arr));
    }

    public static int largestGap(int[] arr){
        int result = -1;
        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 2; i++){
            int gap = arr[i + 1] - arr[i];
            if(gap > result) result = gap;
        }
        return result;
    }
}
