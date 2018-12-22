package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBicmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BicmacBuilder()
                .ingredient(IngredientFactory.makeIngredient(Ingredient.BEKON))
                .sauce(SauceFactory.makeSauce(Sauce.BARBEQUE))
                .burgers(2)
                .ingredient(IngredientFactory.makeIngredient(Ingredient.SAŁATA))
                .ingredient(IngredientFactory.makeIngredient(Ingredient.SER))
                .bun(BunFactory.makeBun("czosnkowy"))
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3,howManyIngredients);

    }
}
