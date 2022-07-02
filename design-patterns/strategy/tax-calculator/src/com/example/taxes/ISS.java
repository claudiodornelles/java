package com.example.taxes;

import com.example.Invoice;
import java.math.BigDecimal;

public class ISS implements Tax {

  private static final BigDecimal taxRate = BigDecimal.valueOf(0.1);

  @Override
  public BigDecimal calculate(Invoice invoice) {
    return invoice.getValue().multiply(taxRate);
  }

}
