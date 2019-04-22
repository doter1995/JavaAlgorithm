package com.doter1995.simplysort;

import static org.junit.Assert.*;

import org.junit.Test;

public class SelectionTest {

  @Test
  public void sort() {
    int[] arr = SortTest.initArr(9);
    int[] sortedArr = Selection.sort(arr);
    assertTrue(SortTest.checkSort(sortedArr));
   }
}