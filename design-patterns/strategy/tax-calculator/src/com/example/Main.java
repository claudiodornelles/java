package com.example;

import com.example.taxes.ICMS;
import com.example.taxes.ISS;
import java.math.BigDecimal;

public class Main {

  public static void main(String[] args) {
    var invoice = new Invoice(BigDecimal.valueOf(123));
    var icms = new ICMS();
    var iss = new ISS();
    var calculator = new Calculator();
    var payableISSValue = calculator.getPayableValue(invoice, iss);
    var payableICMSValue = calculator.getPayableValue(invoice, icms);
    var totalAmountDue = payableISSValue.add(payableICMSValue);

    System.out.println("totalAmountDue = " + totalAmountDue);
  }

}
