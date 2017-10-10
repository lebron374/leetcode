package com.sun;

/**
 * https://leetcode.com/problems/find-the-difference/description/
 * Created by zhi.wang on 2017/10/10.
 */

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] magazine_array = new int[26];
        for(int i=0; i<magazine.length(); i++) {
            magazine_array[magazine.charAt(i) - 'a']++;
        }

        for (int i=0; i<ransomNote.length(); i++){
            int index=ransomNote.charAt(i)-'a';
            magazine_array[index]--;
            if (magazine_array[index] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        boolean bRet = canConstruct("aa", "aab");
        System.out.println(bRet);
    }
}
