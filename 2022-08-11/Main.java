package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(root(2, -7, 3));
        System.out.println(perfectNumber(28));
    }

    //quadratic formula => (-b +- SQRT(b^2 - 4ac)) / 2a
    //"no imaginary numbers will an int return" - yoda, probably
    public static int root(int a, int b, int c){
        return (int)((b * -1 + Math.sqrt(b * b - (4 * a * c))) / (a * 2));
    }

    //perfect number
    public static boolean perfectNumber(int n){
        int sumOfFactors = 0;

        for(int i = 1; i <= n / 2; i++){
            if(n % i == 0) {
                sumOfFactors += i;
            }
        }

        return sumOfFactors == n;
    }
}
