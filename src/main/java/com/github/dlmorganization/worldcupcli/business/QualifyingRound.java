package com.github.dlmorganization.worldcupcli.business;

import java.util.List;

public class QualifyingRound {

    private Match[] matches;
    private List<MatchPlayed> playedMatches;

    public QualifyingRound(int n, List<MatchPlayed> playedMatches) {
        this.matches = new Match[n];
        this.playedMatches = playedMatches;
    }

    public void playMatch() {

        for (Match match: matches) {

            if (!match.isPlayed()) {

                MatchPlayed playedMatch = new MatchPlayed(match.getTeam1(), match.getTeam2());
                playedMatches.add(playedMatch);

                match.setPlayed(true);

                return;
            }
        }
    }
}
