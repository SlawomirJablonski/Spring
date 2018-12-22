package com.kodilla.patterns.builder.bigmac;

public class Sauce {
    public static final String STANDARD = "standard";
    public static final String TYS_WYSP = "1000 wysp";
    public static final String BARBEQUE = "barbeque";
    final private String sauce;

    public Sauce(String sauce){
        if(sauce.equals(STANDARD)||
                sauce.equals(TYS_WYSP)||
                sauce.equals(BARBEQUE)){
            this.sauce = sauce;
        }else {
            throw new IllegalStateException("Available sauce: standard, 1000 wysp, barbecue");
        }
    }

    @Override
    public String toString() {
        return "Sauce{" +
                "sauce='" + sauce + '\'' +
                '}';
    }
}
