package com.example.taxes;

import com.example.Invoice;
import java.math.BigDecimal;

public interface Tax {

  BigDecimal calculate(Invoice invoice);

}
