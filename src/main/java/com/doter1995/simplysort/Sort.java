package com.doter1995.simplysort;

/**
 * @program: JavaAlgorithms
 * @description: 数组排序
 * @author: doter1995
 * @create: 2019-04-14 18:33
 **/
public class Sort {

  /**
   * 选择排序 主要思想：每次循环找到最小值，与其外层循环的值交换位置， 只与数组长度有关，对输入值没有关系 如已排好序的，和完全逆序的所用时间一致
   *
   * @param nums need sort Array
   * @return sorted Array
   */
  public static int[] selectionSort(int[] nums) {
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

  /**
   * 插入排序 主要思想：每次循环将值，插入过已循环的适当位置。
   */
  public static int[] insertionSort(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i; j > 0; j--) {
        if (nums[j - 1] > nums[j]) {
          int temp = nums[j - 1];
          nums[j - 1] = nums[j];
          nums[j] = temp;
        }
      }
    }
    return nums;
  }

  /**
   * 希尔排序 主要思想：***
   */
  public static int[] shellSort(int[] nums) {
    int n = nums.length;
    int i, j, k, gap;
    for (gap = n / 2; gap > 0; gap /= 2) {
      for (i = 0; i < gap; i++) {
        for (j = i + gap; j < n; j += gap) {
          int temp = nums[j];
          for (k = j - gap; k >= 0 && nums[k] > temp; k -= gap) {
            nums[k + gap] = nums[k];
          }
          nums[k + gap] = temp;
        }
      }
    }
    return nums;
  }

  /**
   * 快速排序
   * 主要思想：使用递归每次迭代将该组数据的第一个当作key，
   * 将小于key的值放入左边，将大于key的值放入右边
   * 递归到数组length等于1，这样的话，整个数组都是排好序的。
   */
  public static int[] quickSort(int[] nums) {
    if (nums.length > 1) {
      quickSort(nums, 0, nums.length - 1);
    }
    return nums;
  }

  private static void quickSort(int[] nums, int low, int high) {
    if (low < high) {
      int middle = getQuickSortMidden(nums, low, high);
      quickSort(nums, low, middle - 1);
      quickSort(nums, middle + 1, high);
    }
  }

  private static int getQuickSortMidden(int[] list, int low, int high) {
    int key = list[low];
    while (low < high) {
      while (low < high && list[high] >= key) {
        high--;
      }
      list[low] = list[high];
      System.out.println("key" + key);
      System.out.println("low" + low);
      while (low < high && list[low] <= key) {
        low++;
      }
      list[high] = list[low];
      list[low] = key;
      System.out.println("high" + high);
    }
    return low;
  }

  private static void printArray(int[] nums) {
    for (int num : nums) {
      System.out.print("," + num);
    }
    System.out.println();
  }
}
