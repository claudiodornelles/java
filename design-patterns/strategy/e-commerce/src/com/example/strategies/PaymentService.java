package com.example.strategies;

import com.example.Order;

public class PaymentService {

  private PaymentType paymentType;

  public PaymentService(PaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public void setPaymentType(PaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public void pay(Order order) {
    paymentType.pay(order);
  }
}
