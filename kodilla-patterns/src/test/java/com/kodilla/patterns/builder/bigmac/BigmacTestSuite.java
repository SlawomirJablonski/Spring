package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBicmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BicmacBuilder()
                .ingredient(Ingredient.BEKON)
                .sauce(SauceFactory.makeSauce(Sauce.BARBEQUE))
                .burgers(2)
                .ingredient(Ingredient.SAŁATA)
                .ingredient(Ingredient.SER)
                .bun(BunFactory.makeBun(Bun.WITH_SEZAM))
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3,howManyIngredients);

    }
}
