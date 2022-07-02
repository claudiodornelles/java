package com.example;

import java.math.BigDecimal;

public class Invoice {

  private final BigDecimal value;

  public Invoice(BigDecimal value) {
    this.value = value;
  }

  public BigDecimal getValue() {
    return value;
  }
}
