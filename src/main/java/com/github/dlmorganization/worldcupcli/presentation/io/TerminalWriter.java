package com.github.dlmorganization.worldcupcli.presentation.io;

import org.jline.terminal.Terminal;
import org.jline.utils.InfoCmp;

import java.io.PrintWriter;

public class TerminalWriter {
    private final Terminal terminal;
    private final PrintWriter writer;

    public TerminalWriter(Terminal terminal) {
        this.terminal = terminal;
        this.writer = terminal.writer();
    }

    public void print(Object x) {
         writer.print(x);
    }

    public void println(Object x) {
        writer.println(x);
    }

    public void clear() {
        terminal.puts(InfoCmp.Capability.clear_screen);
    }
}
