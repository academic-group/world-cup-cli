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
        System.out.println("Grupo " + name + " ");

        System.out.println("\nTimes:");
        for (Team team : teams) {
            System.out.println(team.getAbbreviation() + " - " + team.getName());
        }

        System.out.println("\nPartidas:");
        for (Match match : matches) {
            System.out.println(match.getTeam1().getName() + " x " + match.getTeam2().getName());
        }

        System.out.println("\nResultados:");
        for (MatchPlayed played : playedMatches) {
            System.out.println(
                    played.getTeam1().getName() + " "
                            + played.getScore().getFirst()
                            + " x "
                            + played.getScore().getSecond()
                            + " "
                            + played.getTeam2().getName()
            );
        }
    }

    public void playMatch() {
        if (playedMatches.size() >= matches.length) {
            System.out.println("Todas as partidas do grupo já foram jogadas");
            return;
        }

        Match match = matches[playedMatches.size()];

        int goalsTeam1 = 0;
        int goalsTeam2 = 0;

        match.getTeam1().updateGoalsScored(goalsTeam1);
        match.getTeam1().updateGoalsConceded(goalsTeam2);

        match.getTeam2().updateGoalsScored(goalsTeam2);
        match.getTeam2().updateGoalsConceded(goalsTeam1);

        MatchPlayed playedMatch = new MatchPlayed(
                match.getTeam1(),
                match.getTeam2(),
                new Pair<>(goalsTeam1, goalsTeam2)
        );

        playedMatches.add(playedMatch);
    }

    public String getName() {
        return name;
    }
}
