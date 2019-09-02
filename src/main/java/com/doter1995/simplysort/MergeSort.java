package com.doter1995.simplysort;

/**
 * @program: JavaAlgorithm
 * @description:归并排序
 * @author: doter1995
 * @create: 2019-09-01 22:07
 **/
public class MergeSort {

  private static int[] aux;

  public static int[] sort(int[] nums) {
    aux = new int[nums.length];
    sort(nums, 0, nums.length - 1);
    return nums;
  }

  public static int[] sort(int[] nums, int low, int high) {
    if (high <= low) {
      return nums;
    }
    // 计算中间拆分值
    int middle = low + (high - low) / 2;
    //递归左边
    sort(nums, low, middle);
    //递归右边
    sort(nums, middle + 1, high);
    //将左右两边合并
    merge(nums, low, middle, high);
    return nums;
  }

  /**
   * 对数组从low到high的长度进行排序
   */
  private static void merge(int[] nums, int low, int middle, int high) {
    int left = low, right = middle + 1;
    // 将需要排序的数组的对应长度copy一份
    for (int k = low; k <= high; k++) {
      aux[k] = nums[k];
    }
    // 遍历长度
    for (int k = low; k <= high; k++) {
      if (left > middle) { //如果左边已经超了，则将右边顺位的赋值
        nums[k] = aux[right++];
      } else if (right > high) { //如果右边已经超了，则将左边顺位的赋值
        nums[k] = aux[left++];
      } else if (aux[right] < aux[left]) { //如果右边小于左边，将右边的赋值
        nums[k] = aux[right++];
      } else { //否则右边大于左边，将左边的赋值
        nums[k] = aux[left++];
      }

    }
  }
}
