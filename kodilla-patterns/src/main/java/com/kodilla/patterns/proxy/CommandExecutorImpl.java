package com.kodilla.patterns.proxy;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public void runCommand(String cmd) throws IOException {
        //dla uproszczenia nie wykonujemy tu żadnych operacji poza symulowaniem wywołania komendy
        System.out.println(cmd + " command executed.");
    }
}
