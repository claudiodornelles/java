package com.example;

public class IntArraySorter {

  public static void main(String[] args) {
    final var intArray = new int[]{10, 30, 0, 40, 0, 0, 20, 0};

    sort(intArray);

    for (int j : intArray) {
      System.out.print(j + " ");
    }
  }

  /**
   * Sorts an array of integers in ascending order using the selection sort algorithm.
   *
   * @param numbers the array of integers to be sorted
   */
  public static void sort(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] > numbers[j]) {
          int oldNumber = numbers[i];
          numbers[i] = numbers[j];
          numbers[j] = oldNumber;
        }
      }
    }
  }

}
