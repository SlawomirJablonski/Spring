package com.kodilla.patterns.proxy;

import java.io.IOException;

public class CommandExecutorProxy implements CommandExecutor, User {

    private String name;
    private String password;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(UserImpl userImpl) {
        this.name = userImpl.getUserName();
        this.password = userImpl.getPassword();
        commandExecutor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws IOException {
        //gdy admin ładuj wszystko
        if (isAdmin()) {
            commandExecutor.runCommand(cmd);
        }else{
            //pomin komendy zaczynające sie od "rm"
            if(cmd.startsWith("rm")){
                throw new IOException(cmd + " execution forbidden for non-admin.");
            }else{
                //wykonaj pozostałe metody
                commandExecutor.runCommand(cmd);
            }
        }
    }

    @Override
    public boolean isAdmin() {
        if(name.equals("admin_login") && password.equals("admin_password")) {
            return true;
        }return false;
    }
}
