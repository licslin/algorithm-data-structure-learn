package com.licslan.week01;
/**
 * @author LICSLAN 下定决心学算法与数据结构
 * */
public class SelectionSort {
    private SelectionSort(){}

    /**
     * 选择排序非原地排序实现  未实现 TODO
     * */
    public static int[] sortAfter(int[] sortBefore){
        //3,4,1,5  先把最小拿出来  剩下的，再把其中最小的拿出来 ...... 每次选择还没处理的元素里最小的元素
        int[] sortAfter = new int[0];
        if (sortBefore.length>0) {
            //初始化一个排序后的数组
            sortAfter = new int[sortBefore.length];
            //初始化一个新数组 用装少了当时最小值的数组
            int[] newArr = new int[0];
            int length = sortBefore.length;
            for (int k=0;k<sortAfter.length;k++) {
                //遍历这个数组 并生成一个新数组
                for (int i = 0; i < sortBefore.length; i++) {
                    //设置一个最小值
                    int min = sortBefore[0];
                    //找出最小值
                    if(sortBefore[i]<=min){
                        sortAfter[k]=sortBefore[i];
                        sortBefore[i]=sortBefore[i+1];
                    }
                }
                //遍历完了 长度减一
                length --;
            }
        }

        return sortAfter;
    }


    public static int[] delAnyPosition(int[] arr,int position){
        //判断是否合法
        if(position >= arr.length || position < 0){
            return null;
        }
        int[] res = new int[arr.length - 1];
        for(int i = 0;i<res.length;i++){
            if(i < position){
                res[i] = arr[i];
            }else{
                res[i] = arr[i + 1];
            }
        }
        return res;
    }
    //above have problems i did not finished  ~ Oops







    //arr[i...n) not sorted arr[0,i) have sorted 循环不变量
    //arr[i...n)中最小的值放在arr[i]位置


    /**
     * 选择排序原地排序实现
     * */
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //arr[i...n)中最小的值索引  我们从i开始出发 一开始也是从0开始第一个元素开始
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                //如果从i开始往后面找里面的值比minindex索引位置的值还小 就将minindex改j
                if(arr[j]<arr[minIndex])
                    minIndex=j;
            }
            //找到之后就将之前的2个数据交换一个位置就好
            swap(arr,i,minIndex);
        }
    }

    /**
     * 交换2个元素的位置
     * */
    private static void swap(int[] arr, int i, int j ) {
        int tmp= arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void main(String[] args) {
        int[] ints = {1, 34, 4, 5};
        SelectionSort.sort(ints);
        for (int i = 0; i < ints.length; i++)
            System.out.print(ints[i]+" ");
            System.out.println();
    }


}
