package com.example;

public class Fibonacci {

  public static void main(String[] args) {
    int numElements = 20;
    long[] fibonacciSequence = generateFibonacciSequence(numElements);

    for (long fibonacciNumber : fibonacciSequence) {
      System.out.print(fibonacciNumber + " ");
    }
  }

  /**
   * Generates the Fibonacci sequence up to a specified number of elements.
   *
   * @param numElements the number of elements in the Fibonacci sequence to generate
   * @return an array containing the Fibonacci sequence up to the specified number of elements
   * @throws IllegalArgumentException if numElements is not positive
   */
  public static long[] generateFibonacciSequence(int numElements) {
    if (numElements <= 0) {
      throw new IllegalArgumentException("Number of elements must be positive.");
    } else if (numElements == 1) {
      return new long[]{0};
    } else {
      var fibonacciSequence = new long[numElements];
      fibonacciSequence[0] = 0;
      fibonacciSequence[1] = 1;
      for (int i = 2; i < numElements; i++) {
        fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
      }
      return fibonacciSequence;
    }
  }

}