package com.github.dlmorganization.worldcupcli.business;

import com.github.dlmorganization.worldcupcli.utils.Pair;

import java.util.Objects;

public class MatchPlayed extends Match{

    private Pair<Integer, Integer> score;

    public MatchPlayed(Team team1, Team team2, Pair<Integer, Integer> score) {
        super(team1, team2);
        this.score = score;
    }

    public Pair<Integer, Integer> getScore() {
        return score;
    }

    public Team getWinner() {

        if (Objects.equals(score.getFirst(), score.getSecond())) {
            return null;
        }

        if (score.getFirst() > score.getSecond()) {
            return getTeam1();
        }

        return getTeam2();
    }
}
