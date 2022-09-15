package Company.String;

import java.util.Arrays;

/*
    Input:
    N = 4
    arr[] = {geeksforgeeks, geeks, geek, geezer}
    Output: gee
    Explanation: "gee" is the longest common
    prefix in all the given strings.
*/


public class LongestCommonPrefix {

    // Approach 1:
    // function to return the longest common prefix. (main function)
    static String longestCommonPrefix (String arr[], int N)
    {   
        // intializing the String prefix with the String at array index 0 (arr[0]).
        String prefix = arr[0];

        // loop to iterate the array
        for(int i = 0; i < N; i++){

            // passing parameters prefix and arr[i] in commonPrefix functions 
            // as two Strings for comparison and updating the prefix value.
            prefix = commonPrefix(prefix, arr[i]);
        }
        return prefix;
    }

    // function to return the common prefix between two strings. (supporting function)
    static String commonPrefix(String s1, String s2){

        // empty string to store the result of the funtion.
        String res = "";

        // storing the lengths of s1 and s2.
        int l1 = s1.length(), l2 = s2.length();

        // loop to iterate each characters of two strings (s1 and s2)
        // if common add characters in String res, if not then come out loop.
        for(int i=0, j=0; i<=l1-1 && j<=l2-1; i++, j++){
            if(s1.charAt(i) != s2.charAt(j)){
                //return "-1";
                break;
            }
            res = res + s1.charAt(i);
        }
        // return -1 if no common prefix is found.
        if(res.length() == 0) 
            return "-1";

        return res;
    }
    

// Approach 2: using String Builder method
    static String LCP(String arr[], int n){

        StringBuilder result = new StringBuilder();
        Arrays.sort(arr);
        char[] first = arr[0].toCharArray();
        char[] last = arr[n-1].toCharArray();
        
        // loop to iterate the array and compare the characters form both the ends.
        for(int i = 0; i<first.length; i++)
        {
            if(first[i] != last[i])
                break;
            result.append(first[i]);
        }
        if(result.length() == 0) 
            return "-1";
        return result.toString();
    }


    public static void main(String[] args) {

        String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String arr2[] = {"hello", "world"};

        // System.out.println(Arrays.toString(arr));
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        System.out.println(longestCommonPrefix(arr, 4));
        System.out.println(longestCommonPrefix(arr2, 2));

        System.out.println(LCP(arr, 4));
        System.out.println(LCP(arr2, 2));
    }
}
