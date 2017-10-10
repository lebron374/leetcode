package com.sun;

/**
 * https://leetcode.com/problems/find-the-difference/description/
 * Created by zhi.wang on 2017/10/10.
 */

public class FindTheDifference {
    public static char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        for (int i=0; i<s.length(); i++) {
            int index = s.charAt(i)-'a';
            arr[index]++;
        }

        int temp = 0;
        for (int i=0; i<t.length(); i++) {
            int index = t.charAt(i) - 'a';
            if (0 == arr[index]) {
                temp = i;
                break;
            } else {
                arr[index]--;
            }
        }

        return t.charAt(temp);
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abdc", "abcde"));
    }
}
