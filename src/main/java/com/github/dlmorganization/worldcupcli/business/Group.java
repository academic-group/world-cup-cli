package com.github.dlmorganization.worldcupcli.business;

import java.util.List;

public class Group {

    private String name;
    private List<Team> teams;
    private Match[] matches;
    private List<MatchPlayed> playedMatches;

    public Group(String name, List<Team> teams, Match[] matches, List<MatchPlayed> playedMatches) {
        this.name = name;
        this.teams = teams;
        this.matches = matches;
        this.playedMatches = playedMatches;
    }

    public void showInfo() {

    }

    public void playMatch() {

    }

    public String getName() {
        return name;
    }
}
