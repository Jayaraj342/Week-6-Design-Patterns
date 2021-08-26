package com.greatlearning.designpattern3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class USDConverter implements CurrencyConverter {
    @Override
    public double convertToINR(double amount) {
        double inr = amount / 74.12;
        return BigDecimal.valueOf(inr).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
