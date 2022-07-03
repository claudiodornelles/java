package com.example;

import java.math.BigDecimal;
import java.util.UUID;

public class Order {

  private final UUID id;
  private final BigDecimal value;

  public Order(BigDecimal value) {
    this.id = UUID.randomUUID();
    this.value = value;
  }

  public UUID getId() {
    return id;
  }

  public BigDecimal getValue() {
    return value;
  }
}
