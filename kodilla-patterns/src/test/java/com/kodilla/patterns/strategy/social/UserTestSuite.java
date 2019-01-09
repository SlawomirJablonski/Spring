package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User danka = new Millenials("hotDanka");
        User jerzy = new YGeneration("jurekKameralnie");
        User wojt = new ZGeneration("wójtPoImprzie");

        //When
        String dankaLog = danka.sharePost();
        String jerzyLog = jerzy.sharePost();
        String wojtLog = wojt.sharePost();

        //Then
        Assert.assertEquals("hotDanka had insert new post on Facebook", dankaLog);
        Assert.assertEquals("jurekKameralnie had insert new post on Twitter", jerzyLog);
        Assert.assertEquals("wójtPoImprzie had insert new post on Snapchat", wojtLog);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User jerzy = new YGeneration("jurekKameralnie");
        //When
        jerzy.setSocialPublisher(new SnapchatPublisher());
        String jerzyLog = jerzy.sharePost();
        //Then
        Assert.assertEquals("jurekKameralnie had insert new post on Snapchat", jerzyLog);
    }
}
