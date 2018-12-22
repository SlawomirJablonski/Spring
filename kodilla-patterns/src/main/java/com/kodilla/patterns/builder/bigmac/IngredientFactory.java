package com.kodilla.patterns.builder.bigmac;

public final class IngredientFactory {

    public static final String SAŁATA = "sałata";
    public static final String BEKON = "bekon";
    public static final String OGÓREK = "ogórek";
    public static final String PAPRYCZKI = "papryczki";
    public static final String CHILLI = "chilli";
    public static final String PIECZARKI = "pieczarki";
    public static final String KREWETKI = "krewetki";
    public static final String SER = "ser";

    public static Ingredient makeIngredient(String ingredient) {
        switch (ingredient) {
            case SAŁATA:
                return new Ingredient(ingredient);
            case BEKON:
                return new Ingredient(ingredient);
            case OGÓREK:
                return new Ingredient(ingredient);
            case PAPRYCZKI:
                return new Ingredient(ingredient);
            case CHILLI:
                return new Ingredient(ingredient);
            case PIECZARKI:
                return new Ingredient(ingredient);
            case KREWETKI:
                return new Ingredient(ingredient);
            case SER:
                return new Ingredient(ingredient);
            default:
                throw new IllegalStateException("Available ingredients: sałata, cebula, bekon, ogórek, papryczki chilli, pieczarki, krewetki, ser");
        }
    }
}
