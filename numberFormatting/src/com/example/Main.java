package com.example;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

  private static final String DECIMAL_PATTERN = "#,###,##0.0000000000000";
  private static final DecimalFormat PT_BR_DECIMAL_FORMAT = (DecimalFormat) NumberFormat.getNumberInstance(new Locale("pt", "BR"));

  static {
    PT_BR_DECIMAL_FORMAT.applyPattern(DECIMAL_PATTERN);
  }

  public static void main(String[] args) {
    var number = 2.1234567898765;
    System.out.println("number = " + PT_BR_DECIMAL_FORMAT.format(number));
  }

}