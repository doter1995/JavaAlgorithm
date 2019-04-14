package com.doter1995.simplysort;

/**
 * @program: JavaAlgorithms
 * @description: 选择排序
 * 主要思想：每次循环找到最小值，与其外层循环的值交换位置，
 * 只与数组长度有关，对输入值没有关系
 * 如已排好序的，和完全逆序的所用时间一致
 * @author: doter1995
 * @create: 2019-04-14 18:33
 **/
public class Selection {

  public static int[] sort(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      // 此处选出本次循环最小值所在下标
      int minIndex = i;
      for (int j = i; j < nums.length; j++) {
        if (nums[minIndex] > nums[j]) {
          minIndex = j;
        }
      }
      //将本次循环的值于最小值交换
      if (minIndex != i) {
        int temp = nums[minIndex];
        nums[minIndex] = nums[i];
        nums[i] = temp;
      }
    }
    return nums;
  }

}
