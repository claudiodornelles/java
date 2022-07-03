package com.example.strategies;

import com.example.Order;

public class CreditCard implements PaymentType {

  @Override
  public void pay(Order order) {
    System.out.printf("Order %s has been payed by CreditCard. Amount payed: %s\n", order.getId(), order.getValue());
  }
}
