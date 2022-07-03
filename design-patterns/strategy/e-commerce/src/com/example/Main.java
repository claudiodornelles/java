package com.example;

import com.example.strategies.CreditCard;
import com.example.strategies.PayPal;
import com.example.strategies.PaymentService;
import java.math.BigDecimal;

public class Main {

  public static void main(String[] args) {
    var firstOrder = new Order(BigDecimal.valueOf(155.34));
    var paymentService = new PaymentService(new CreditCard());

    paymentService.pay(firstOrder);

    var secondOrder = new Order(BigDecimal.valueOf(245.54));

    paymentService.setPaymentType(new PayPal());

    paymentService.pay(secondOrder);
  }

}
