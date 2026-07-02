package com.github.dlmorganization.worldcupcli.business;

public class Match {

    private Team team1;
    private Team team2;
    private boolean played;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.played = false;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public boolean isPlayed() {
        return played;
    }

    public void setPlayed(boolean played) {
        this.played = played;
    }
}
