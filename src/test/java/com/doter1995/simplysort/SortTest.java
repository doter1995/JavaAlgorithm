package com.doter1995.simplysort;

public class SortTest {

  static public int[] initArrr(int length) {
    int[] arr = new int[length];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * length * 10);
    }
    return arr;
  }


  static public boolean checkSort(int[] sortArr) {
    int temp = -1;
    for (int i = 0; i < sortArr.length; i++) {
      if (temp > sortArr[i]) {
        return false;
      }
      temp = sortArr[i];
    }
    return true;
  }
}