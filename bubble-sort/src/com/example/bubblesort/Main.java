package com.example.bubblesort;

public class Main {

  public static void main(String[] args) {

    final var array = new int[]{20, 35, -15, 5, 55, 1, -22};

    bubbleSort(array);

    for (var number : array) {
      System.out.println(number);
    }

  }

  private static void bubbleSort(int[] array) {
    for (var lastSortedIndex = array.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
      for (var i = 0; i < lastSortedIndex; i++) {
        if (array[i] > array[i + 1]) {
          final var temp = array[i + 1];
          array[i + 1] = array[i];
          array[i] = temp;
        }
      }
    }
  }

}