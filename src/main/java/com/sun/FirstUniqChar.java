package com.sun;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/description/
 * Created by zhi.wang on 2017/10/10.
 */

public class FirstUniqChar {
    public static int firstUniqChar(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
