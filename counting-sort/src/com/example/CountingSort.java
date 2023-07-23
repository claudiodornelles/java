package com.example;

public class CountingSort {

  public static void main(String[] args) {
    final int[] inputArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

    countingSort(inputArray, 1, 10);

    for (int number : inputArray) {
      System.out.println(number);
    }
  }

  private static void countingSort(int[] inputArray, int min, int max) {
    if (inputArray.length < 2) {
      return;
    }

    final int[] countingArray = new int[max];

    for (int i = 0; i < inputArray.length; i++) {
      countingArray[inputArray[i] - min]++;
    }

    int j = 0;
    for (int i = min; i <= max; i++) {
      while (countingArray[i - min] > 0) {
        inputArray[j++] = i;
        countingArray[i - min]--;
      }
    }

  }

}
