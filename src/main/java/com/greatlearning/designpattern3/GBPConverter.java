package com.greatlearning.designpattern3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class GBPConverter implements CurrencyConverter {
    @Override
    public double convertToINR(double amount) {
        double inr = amount / 101.68;
        return BigDecimal.valueOf(inr).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
