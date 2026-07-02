package com.github.dlmorganization.worldcupcli.business;

import com.github.dlmorganization.worldcupcli.utils.Pair;

import java.util.Objects;
import java.util.Random;

public class MatchPlayed extends Match{

    private Pair<Integer, Integer> score;

    public MatchPlayed(Team team1, Team team2) {
        super(team1, team2);
        setPlayed(true);
        Random random = new Random();
        this.score = new Pair<>(random.nextInt(7), random.nextInt(7));
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
