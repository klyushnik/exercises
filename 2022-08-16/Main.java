package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       
        System.out.println(yourNameIsMyName("john", "johanna"));
        walkOnAxis(2);
    }

    //Function to check if the shortest name is a subsequence of the longest name
    //regex expression: ".*" => any symbol any number of times. Thus, matching "john" would be ".*j.*o.*h.*n.*"
    public static String yourNameIsMyName(String s1, String s2){
        //shortest and longest names
        String shortestName = s1.length() < s2.length() ? s1 : s2;
        String longestName = s1.length() > s2.length() ? s1 : s2;

        String regex = "";
        for(char c : shortestName.toCharArray()){
            regex += ".*" + c;
        }
        regex += ".*";

        return longestName.matches(regex) ? "YES" : "NO";
    }


    public static void walkOnAxis(int num){
        //this seems like a nth triangle number problem, which is 1+2+3+4... => n(n+1) / 2, but we have 4+3+2+1.
        //however, in this case, we have one single walk from 0 to n, which adds n to the result
        //so, the formula for this would be ( n(n+1) / 2 ) + n.
        //Since we're printing the result, this function is void.
        System.out.println(num);
        System.out.println((num * (num + 1) / 2 + num));
    }

}
