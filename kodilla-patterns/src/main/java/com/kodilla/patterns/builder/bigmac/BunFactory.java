package com.kodilla.patterns.builder.bigmac;

public class BunFactory {
    public static final String WITH_SEZAM = "with sezam";
    public static final String WITHOUT_SEZAM = "without sezam";

    public static Bun makeBun(String bunType) {
        switch (bunType) {
            case WITH_SEZAM:
                return new Bun(bunType);
            case WITHOUT_SEZAM:
                return new Bun(bunType);
            default:
                throw new IllegalStateException("Available buns: bun with sezam, bun without sezam");
        }
    }
}
