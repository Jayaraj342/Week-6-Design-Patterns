package com.greatlearning.designpattern3;

public class Main3 {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter;
        int gbp = 500;
        currencyConverter = new GBPConverter();
        System.out.println("500 GBP = " + currencyConverter.convertToINR(gbp) + " INR");

        int usd = 750;
        currencyConverter = new USDConverter();
        System.out.println("750 USD = " + currencyConverter.convertToINR(usd) + " INR");
    }
}
