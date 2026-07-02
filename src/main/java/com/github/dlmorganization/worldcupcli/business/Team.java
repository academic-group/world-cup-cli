package com.github.dlmorganization.worldcupcli.business;

public class Team {

    private String name;
    private String abbreviation;
    private int goalsScored;
    private int goalsConceded;
    private int goalsDifference;
    private boolean eliminated;

    public Team(String name, String abbreviation, int goalsScored, int goalsConceded, int goalsDifference) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.goalsScored = goalsScored;
        this.goalsConceded = goalsConceded;
        this.goalsDifference = goalsDifference;
        this.eliminated = false;
    }

    public void updateGoalsScored(int goals) {
        this.goalsScored += goals;
    }

    public void updateGoalsConceded(int goals) {
        this.goalsConceded += goals;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public int getGoalsDifference() {
        return goalsDifference;
    }

    public boolean isEliminated() {
        return eliminated;
    }

    public void setEliminated(boolean eliminated) {
        this.eliminated = eliminated;
    }
}
