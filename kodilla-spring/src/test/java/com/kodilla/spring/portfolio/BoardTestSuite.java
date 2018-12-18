package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        String toDoTask = "ToDo1";
        String inProgressTask = "inProgress1";
        String doneTask = "done1";

        //When
        board.getToDoList().getTasks().add(toDoTask);
        board.getInProgressList().getTasks().add(inProgressTask);
        board.getDoneList().getTasks().add(doneTask);

        //Then
        Assert.assertEquals("ToDo1",board.getToDoList().getTasks().get(0));
        Assert.assertEquals("inProgress1",board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("done1",board.getDoneList().getTasks().get(0));
    }
}