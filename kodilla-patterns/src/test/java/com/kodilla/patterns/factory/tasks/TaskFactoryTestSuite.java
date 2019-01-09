package com.kodilla.patterns.factory.tasks;
//

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("lunch products", shopping.getTaskName());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        boolean isTaskExecutedBeforeExecution = painting.isTaskExecuted();
        painting.executeTask();
        boolean isTaskExecutedAfterExecution = painting.isTaskExecuted();
        //Then
        Assert.assertFalse(isTaskExecutedBeforeExecution);
        Assert.assertTrue(isTaskExecutedAfterExecution);
    }

    @Test
    public void testNullTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task nullTask = factory.makeTask("Swimming");
        //Then
        Assert.assertNull(nullTask);
    }
}
