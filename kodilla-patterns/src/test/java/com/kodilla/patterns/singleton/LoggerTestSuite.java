package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void changeLogger() {
        Logger.getInstance().log("open task");
        Logger.getInstance().log("payout task");
        Logger.getInstance().log("close task");
    }

    @Test
    public void testGetLastLog(){
        //Given
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("close task",result);
    }
}