package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    //private String userName;
    final String userName;

    public ForumUser() {
        userName = "John Smith";
    }

    public String getUserName() {
        return userName;
    }
}
