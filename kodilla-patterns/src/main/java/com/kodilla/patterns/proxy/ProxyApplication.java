package com.kodilla.patterns.proxy;

import java.io.IOException;

public class ProxyApplication {
    public static void main(String[] args){
        UserImpl myUser = new UserImpl("Jan","Nowak");
        CommandExecutor myExecutor = new CommandExecutorProxy(myUser);

        String command1 = "rm1";
        String command2 = "mrrm";
        String command3 = "rm2";

        try{
            myExecutor.runCommand(command1);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try{
            myExecutor.runCommand(command2);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try{
            myExecutor.runCommand(command3);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
