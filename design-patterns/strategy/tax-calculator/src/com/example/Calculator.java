package com.example;

import com.example.taxes.Tax;
import java.math.BigDecimal;

public class Calculator {

  public BigDecimal getPayableValue(Invoice invoice, Tax tax) {
    return tax.calculate(invoice);
  };

}
