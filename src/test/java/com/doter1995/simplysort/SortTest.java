package com.doter1995.simplysort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortTest {

  @Test
  public void selectionSort() {
    int[] arr = {8, 2, 6, 4, 1, 3, 7, 5};
    int[] result = {1, 2, 3, 4, 5, 6, 7, 8};
    int[] sortedArr = Sort.selectionSort(arr);
    assertArrayEquals(sortedArr,result);
  }

  @Test
  public void insertionSort() {
    int[] arr = {8, 2, 6, 4, 1, 3, 7, 5};
    int[] result = {1, 2, 3, 4, 5, 6, 7, 8};
    int[] sortedArr = Sort.insertionSort(arr);
    assertArrayEquals(sortedArr,result);
  }

  @Test
  public void shellSort() {
    int[] arr = {8, 2, 6, 4, 1, 3, 7, 5};
    int[] result = {1, 2, 3, 4, 5, 6, 7, 8};
    int[] sortedArr = Sort.shellSort(arr);
    assertArrayEquals(sortedArr,result);
  }

  @Test
  public void quickSort() {
    int[] arr = {8, 2, 6, 4, 1, 3, 7, 5};
    int[] result = {1, 2, 3, 4, 5, 6, 7, 8};
    int[] sortedArr = Sort.quickSort(arr);
    assertArrayEquals(sortedArr,result);
  }

}