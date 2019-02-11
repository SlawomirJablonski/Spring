package com.kodilla.patterns.proxy;

import java.io.IOException;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;

    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(User user) {

        this.isAdmin = user.isAdmin();

        commandExecutor = new CommandExecutorImpl();
    }
//
    @Override
    public void runCommand(String cmd) throws IOException {
        //gdy admin ładuj wszystko
        if (isAdmin) {
            commandExecutor.runCommand(cmd);
        } else {
            //pomin komendy zaczynające sie od "rm"
            if (cmd.startsWith("rm")) {
                throw new IOException(cmd + " execution forbidden for non-admin.");
            } else {
                //wykonaj pozostałe metody
                commandExecutor.runCommand(cmd);
            }
        }
    }
}
