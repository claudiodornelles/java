package com.example;

import java.util.Arrays;

public class CountingSort {

  public static void main(String[] args) {
    final int[] inputArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

    quickSort(inputArray);

    for (int number : inputArray) {
      System.out.println(number);
    }
  }

  private static void quickSort(int[] inputArray) {
    if (inputArray.length < 2) {
      return;
    }

    final var max = Arrays.stream(inputArray).max().orElse(0);
    final int[] countingArray = new int[max];

    for (int number: inputArray) {
      final var countingArrayIndex = number - 1;
      countingArray[countingArrayIndex] += 1;
    }

    int j = 0;
    for (int i = 0; i < inputArray.length; i++) {
      if (countingArray[i] > 0) {
        for (int k = 1; k < countingArray[i] + 1; k++) {
          inputArray[j++] = i + 1;
        }
      }
    }

  }

}
