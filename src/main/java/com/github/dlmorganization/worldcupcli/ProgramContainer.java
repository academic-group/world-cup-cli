package com.github.dlmorganization.worldcupcli;

import com.github.dlmorganization.worldcupcli.presentation.io.TerminalReader;
import com.github.dlmorganization.worldcupcli.presentation.io.TerminalWriter;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.io.IOException;

public class ProgramContainer {
    private static ProgramContainer instance;
    private Terminal terminal;
    private TerminalReader terminalReader;
    private TerminalWriter terminalWriter;

    private ProgramContainer() {}

    public void start() {
        try {
            this.terminal = TerminalBuilder.builder().name("World Cup").system(true).build();
            terminal.enterRawMode();
            this.terminalReader = new TerminalReader(terminal);
            this.terminalWriter = new TerminalWriter(terminal);
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void finish() {
        try {
            this.terminal.close();
        }
        catch (IOException e) {
            IO.println("Erro: " + e.getMessage());
        }
    }

    public static ProgramContainer getInstance() {
        if (instance == null)
            instance = new ProgramContainer();
        return instance;
    }

    public static TerminalReader getTerminalReader() {
        return getInstance().terminalReader;
    }

    public static TerminalWriter getTerminalWriter() {
        return getInstance().terminalWriter;
    }
}
