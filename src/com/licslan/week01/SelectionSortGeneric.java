package com.licslan.week01;

import com.licslan.week00.Student;

/**
 * @author LICSLAN 下定决心学算法与数据结构
 * */
public class SelectionSortGeneric {
    /**
     * 对前面学习的选择排序支持泛型
     * 选择排序原地排序实现  <E>不一定支持大小比较  E 实现 Comparable接口的  用在泛型表示实现 用在类上面表示继承
     * 基于比较的排序算法
     * */
    public static <E extends Comparable<E>> void sort(E[] arr){
        //arr[0...i)有序  arr[i...n)无序
        for (int i = 0; i < arr.length; i++) {
            //arr[i...n)中最小的值索引  我们从i开始出发 一开始也是从0开始第一个元素开始
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                //如果从i开始往后面找里面的值比minIndex索引位置的值还小 就将minIndex改j
                if(arr[j].compareTo(arr[minIndex])<0)
                    minIndex=j;
            }
            //找到之后就将之前的2个数据交换一个位置就好
            swap(arr,i,minIndex);
        }
    }

    /**
     * 交换2个元素的位置
     * */
    private static <E> void swap(E[] arr, int i, int j ) {
        E tmp= arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }


    public static void main(String[] args) {
        Integer[] ints = {1, 34, 4, 5};
        SelectionSortGeneric.sort(ints);
        for (int i = 0; i < ints.length; i++)
            System.out.print(ints[i]+" ");
        System.out.println();


        Student[] students = {new Student(22),new Student(19),new Student(20)};

        SelectionSortGeneric.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
