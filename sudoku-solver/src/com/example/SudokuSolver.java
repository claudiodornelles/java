package com.example;

public class SudokuSolver {

  public static void main(String[] args) {
    int[][] board = {
        {9, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 9, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    if (solveBoard(board)) {
      System.out.println("Board solved successfully!");
    } else {
      System.out.println("This is an unsolvable board");
    }

    printBoard(board);
  }

  private static void printBoard(final int[][] board) {
    for (int row = 0; row < board.length; row++) {
      if (row % 3 == 0) {
        System.out.println("---------------------------------------");
      }
      for (int column = 0; column < board.length; column++) {
        if (column % 3 == 0) {
          System.out.print(" | ");
        }
        System.out.print(" " + board[row][column] + " ");
        if (column == board.length - 1) {
          System.out.println(" | ");
        }
      }
      if (row == board.length - 1) {
        System.out.println("---------------------------------------");
      }
    }
  }

  private static boolean solveBoard(int[][] board) {
    for (int row = 0; row < board.length; row++) {
      for (int column = 0; column < board.length; column++) {
        if (board[row][column] == 0) {
          for (int numberToTry = 1; numberToTry <= board.length; numberToTry++) {
            if (isValidPlacementForNumber(numberToTry, row, column, board)) {
              board[row][column] = numberToTry;

              if (solveBoard(board)) {
                return true;
              } else {
                board[row][column] = 0;
              }
            }
          }
          return false;
        }
      }
    }
    return true;
  }

  private static boolean isValidPlacementForNumber(final int number, final int row,
      final int column, final int[][] board) {
    return !isNumberInRow(number, row, board)
        && !isNumberInColumn(number, column, board)
        && !isNumberInBlock(number, row, column, board);
  }

  private static boolean isNumberInRow(final int number, final int row, final int[][] board) {
    for (int column = 0; column < board.length; column++) {
      if (board[row][column] == number) {
        return true;
      }
    }
    return false;
  }

  private static boolean isNumberInColumn(final int number, final int column, final int[][] board) {
    for (final int[] ints : board) {
      if (ints[column] == number) {
        return true;
      }
    }
    return false;
  }

  private static boolean isNumberInBlock(final int number, final int row, final int column,
      final int[][] board) {
    int blocksFirstRow = row - row % 3;
    int blocksFirstColumn = column - column % 3;

    for (int blockRow = blocksFirstRow; blockRow < blocksFirstRow + 3; blockRow++) {
      for (int blockColumn = blocksFirstColumn; blockColumn < blocksFirstColumn + 3;
          blockColumn++) {
        if (board[blockRow][blockColumn] == number) {
          return true;
        }
      }
    }

    return false;
  }

}
