package com.company;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        var doubleValue = 10_000_000.53;
        var numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue));

        var iF = NumberFormat.getIntegerInstance();
        System.out.println("Integer: " + iF.format(doubleValue));

        iF.setGroupingUsed(false);
        System.out.println("Integer: " + iF.format(doubleValue));

        var locale = new Locale("es");
        var localeFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println("Integer: " + localeFormatter.format(doubleValue));

        var currencyFormatter = NumberFormat.getCurrencyInstance();
        System.out.println("Currency: " + currencyFormatter.format(doubleValue));

    }
}
