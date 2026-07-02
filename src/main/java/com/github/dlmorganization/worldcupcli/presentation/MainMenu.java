package com.github.dlmorganization.worldcupcli.presentation;

import com.github.dlmorganization.worldcupcli.ProgramContainer;
import com.github.dlmorganization.worldcupcli.presentation.io.KeyboardKey;
import com.github.dlmorganization.worldcupcli.presentation.io.TerminalReader;
import com.github.dlmorganization.worldcupcli.presentation.io.TerminalWriter;

public class MainMenu {

    public void start() {
        try {
            TerminalReader reader = ProgramContainer.getTerminalReader();
            TerminalWriter writer = ProgramContainer.getTerminalWriter();
            KeyboardKey key = reader.getKey();
            while (key != KeyboardKey.ENTER) {
                writer.println(key);
                key = reader.getKey();
            }
            writer.println("ENTER!");
            try {
                Thread.sleep(3000);
                writer.clear();
                Thread.sleep(1000);
                writer.println("Fim do Programa");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        catch (Exception e) {

        }
    }

    private void printMenu() {
        System.out.println("1 - Menu de Seleções");
        System.out.println("2 - Menu de Partidas");
        System.out.println("0 - Sair");
    }
}
