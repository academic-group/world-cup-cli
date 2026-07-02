package com.github.dlmorganization.worldcupcli.business;

public class WorldCupManager {

    private boolean hasStarted;
    private Phase currentPhase;

    public WorldCupManager() {
        this.hasStarted = false;
        this.currentPhase = new Phase("Fase de Grupos");
    }

    public void startCup() {
        hasStarted = true;
    }

    public void finishCup() {
        hasStarted = false;
    }

    public void drawTeams() {
    }

    public Phase getCurrentPhase() {
        return currentPhase;
    }
}