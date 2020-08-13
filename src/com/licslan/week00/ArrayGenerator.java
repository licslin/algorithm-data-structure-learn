package com.licslan.week00;

/**
 * @author LICSLAN 下定决心学算法与数据结构
 * */
public class ArrayGenerator {
    private ArrayGenerator(){}
    public static Integer[] arrayOrderGenerator(int data){
        Integer[] arr = new Integer[data];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        return arr;
    }

}
