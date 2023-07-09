package com.example.quicksort;

import java.util.Objects;

public class Main {

  public static void main(String[] args) {
    int[] arrayToBeSorted = {22, 20, -12, 45, -11, 0, 94};

    quickSort(arrayToBeSorted);

    for (int j : arrayToBeSorted) {
      System.out.println(j);
    }
  }

  public static void quickSort(int[] input) {
    if (Objects.isNull(input) || input.length < 2) {
      return;
    }

    sortPartition(input, 0, input.length);
  }

  private static void sortPartition(int[] input, int start, int end) {
    if (end - start < 2) {
      return;
    }

    int pivotIndex = partition(input, start, end);
    sortPartition(input, start, pivotIndex);
    sortPartition(input, pivotIndex + 1, end);
  }

  private static int partition(int[] input, int start, int end) {
    int pivot = input[start];
    int i = start;
    int j = end;

    while (i < j) {

      while (i < j && input[--j] >= pivot);
      if (i < j) {
        input[i] = input[j];
      }

      while (i < j && input[++i] <= pivot);
      if (i < j) {
        input[j] = input[i];
      }

    }

    input[j] = pivot;
    return j;
  }



}
