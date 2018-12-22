package com.kodilla.patterns.builder.bigmac;

public class Ingredient {
    public static final String SAŁATA = "sałata";
    public static final String BEKON = "bekon";
    public static final String OGÓREK = "ogórek";
    public static final String PAPRYCZKI = "papryczki";
    public static final String CHILLI = "chilli";
    public static final String PIECZARKI = "pieczarki";
    public static final String KREWETKI = "krewetki";
    public static final String SER = "ser";
    final private String ingredient;

    public Ingredient(String ingredient){
        if(ingredient.equals(SAŁATA)||
        ingredient.equals(BEKON)||
        ingredient.equals(OGÓREK)||
        ingredient.equals(PAPRYCZKI)||
        ingredient.equals(CHILLI)||
        ingredient.equals(PIECZARKI)||
        ingredient.equals(KREWETKI)||
        ingredient.equals(SER)){
            this.ingredient = ingredient;
        }else {
            throw new IllegalStateException("Available ingredients: sałata, cebula, bekon, ogórek, papryczki chilli, pieczarki, krewetki, ser");
        }
    }

    public String getIngredient() {
        return ingredient;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredient='" + ingredient + '\'' +
                '}';
    }
}
