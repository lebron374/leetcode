package com.sun;

/**
 * https://leetcode.com/problems/nth-digit/description/
 * https://www.programcreek.com/2014/09/leetcode-nth-digit-java/
 * Created by zhi.wang on 2017/10/10.
 */
public class FindNthDigit {
    /*
     1 - 9  : 占位长度为 9
     10 - 99 : 占位长度为 90 * 2
     100 - 999 : 占位长度为 900 * 3
     1000 - 9999 : 占位长度为 9000 * 4
     */
    public static int findNthDigit(int n) {
        long m = n;
        long start = 1;
        long len = 1;
        long count = 9;

        // 确定所属区间以及在所属区间的偏移量，其中start为所属区间的开始数字，m为偏移数字长度
        while (m>len*count) {

            //减去已占用部分长度
            m -= len * count;

            //每个数字长度+1
            len++;

            //每个范围的数量变大
            count *= 10;

            //每个范围起始数字变大
            start *= 10;
        }

        //包含起始字段长度本身，所以长度要减1,定位到具体的数字
        start = start + (m-1)/len;

        //计算具体数字里面的偏移量
        return  String.valueOf(start).charAt((int)((m-1)%len)) - '0';
    }

    public static void main(String[] args) {
        System.out.println(findNthDigit(12));
    }
}
