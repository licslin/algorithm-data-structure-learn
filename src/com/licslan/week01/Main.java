package com.licslan.week01;
/**
 * @author LICSLAN 下定决心学算法与数据结构
 * */
public class Main {

    /***
     * 选择排序法
     * 0.非原地实现：先把最小拿出来  剩下的，再把其中最小的拿出来 ...... 每次选择还没处理的元素里最小的元素
     * 1.选择排序过程占用了额外的空间  可否原地完成？ （原地排序）
     * */
    public static void main(String[] args) {
        int[] ints = SelectionSort.sortAfter(new int[]{3, 4, 1, 5});
        for (int i : ints) {
            System.out.println(i);
        }
    }
}
