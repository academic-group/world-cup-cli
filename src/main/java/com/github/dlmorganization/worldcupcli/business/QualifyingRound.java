package com.github.dlmorganization.worldcupcli.business;

import java.util.List;

public class QualifyingRound {

    private Match[] matches;
    private List<MatchPlayed> playedMatches;

    public QualifyingRound(Match[] matches, List<MatchPlayed> playedMatches) {
        this.matches = matches;
        this.playedMatches = playedMatches;
    }
}
