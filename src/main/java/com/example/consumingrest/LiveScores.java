package com.example.consumingrest;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiveScores {
    private List<Match> matches;
    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    private String status;

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public String getStatus() {
        return status;
    }

}

