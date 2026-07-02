package com.github.dlmorganization.worldcupcli;

import com.github.dlmorganization.worldcupcli.presentation.MainMenu;

public class Program {
    public void start() {
        ProgramContainer.getInstance().start();
        MainMenu mainMenu = new MainMenu();
        mainMenu.start();
        ProgramContainer.getInstance().finish();
    }
}
