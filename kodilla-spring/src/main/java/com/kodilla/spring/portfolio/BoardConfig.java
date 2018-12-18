package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan({"com.kodilla.spring.portfolio"})
public class BoardConfig {

    @Bean
    public TaskList toDoList(){
        return new TaskList();
    }

    @Bean
    public TaskList inProgressList(){
        return new TaskList();
    }

    @Bean
    public TaskList doneList(){
        return new TaskList();
    }
}