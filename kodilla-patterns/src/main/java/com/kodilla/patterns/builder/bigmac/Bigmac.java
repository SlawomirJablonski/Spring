package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final Bun bun;
    private final int burgers;
    private final Sauce sauce;
    private final List<Ingredient> ingredients;

    public static class BicmacBuilder {
        private Bun bun;
        private int burgers;
        private Sauce sauce;
        private List<Ingredient> ingredients = new ArrayList<>();

        public BicmacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BicmacBuilder burgers(int burgers){
            this.burgers = burgers;
            return this;
        }

        public BicmacBuilder sauce(Sauce sauce){
            this.sauce = sauce;
            return this;
        }

        public BicmacBuilder ingredient(Ingredient ingredient){
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build(){
            boolean noBun = false, missingBurger = false;
            if(this.bun == null || this.burgers < 0){
                throw new IllegalStateException("Can not crete Bigmac");
            }
            return new Bigmac(bun,burgers,sauce,ingredients);
        }
    }

    public Bigmac(Bun bun, int burgers, Sauce sauce, List<Ingredient> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public Bun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
