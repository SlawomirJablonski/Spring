package com.kodilla.patterns.builder.bigmac;

public class Bun {
    public static final String WITH_SEZAM = "with sezam";
    public static final String WITHOUT_SEZAM = "without sezam";
    final private String bunType;

    public Bun(String bunType){
        if(bunType.equals(WITH_SEZAM)||
                bunType.equals(WITHOUT_SEZAM)){
            this.bunType = bunType;
        }else {
            throw new IllegalStateException("Available buns: bun with sezam, bun without sezam");
        }
    }

    @Override
    public String toString() {
        return "Bun{" +
                "bunType='" + bunType + '\'' +
                '}';
    }
}
