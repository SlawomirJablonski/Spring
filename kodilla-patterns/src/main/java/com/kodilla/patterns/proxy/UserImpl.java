package com.kodilla.patterns.proxy;

public class UserImpl implements User{
    private String userName;
    private String password;

    public UserImpl(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public boolean isAdmin(){
        return false;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
