package com.kodilla.patterns.builder.bigmac;

public class SauceFactory {
    public static final String STANDARD = "standard";
    public static final String TYS_WYSP = "1000 wysp";
    public static final String BARBEQUE = "barbeque";

    public static Sauce makeSauce(String sauce) {
        switch (sauce) {
            case STANDARD:
                return new Sauce(sauce);
            case TYS_WYSP:
                return new Sauce(sauce);
            case BARBEQUE:
                return new Sauce(sauce);
            default:
                throw new IllegalStateException("Available sauce: standard, 1000 wysp, barbecue");
        }
    }
}
