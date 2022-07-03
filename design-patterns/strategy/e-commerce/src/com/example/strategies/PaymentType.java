package com.example.strategies;

import com.example.Order;

public interface PaymentType {

  void pay(Order order);

}
