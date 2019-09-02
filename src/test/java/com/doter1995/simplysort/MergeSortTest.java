package com.doter1995.simplysort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortTest {

  @Test
  public void sort() {
    int[] arr = {8, 2, 6, 4, 1, 3, 7, 5};
    int[] result = {1, 2, 3, 4, 5, 6, 7, 8};
    int[] sortedArr = MergeSort.sort(arr);
    assertArrayEquals(sortedArr, result);
  }

}