package com.example.strategies;

import com.example.Order;

public class PayPal implements PaymentType {

  @Override
  public void pay(Order order) {
    System.out.printf("Order %s has been payed by PayPal. Amount payed: %s\n", order.getId(), order.getValue());
  }
}
