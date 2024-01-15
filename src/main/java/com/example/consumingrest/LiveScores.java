package com.example.consumingrest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiveScores {
    private List<Map<String, String>> firstHalf;
    private List<Map<String, String>> asianHandicap;
    private List<Map<String, String>> bothTeamsToScore;
    private List<Map<String, String>> cardsInMatch;
    private List<Map<String, String>> corners2Way;
    private List<Map<String, String>> doubleChance;
    private List<Map<String, String>> drawNoBet;
    private List<Map<String, String>> firstTeamToScore;
    private List<Map<String, String>> fullTime;
    private List<Map<String, String>> matchGoals;

    public List<Map<String, String>> getFirstHalf() {
        return firstHalf;
    }

    public List<Map<String, String>> getAsianHandicap() {
        return asianHandicap;
    }

    public List<Map<String, String>> getBothTeamsToScore() {
        return bothTeamsToScore;
    }

    public List<Map<String, String>> getCardsInMatch() {
        return cardsInMatch;
    }

    public List<Map<String, String>> getCorners2Way() {
        return corners2Way;
    }

    public List<Map<String, String>> getDoubleChance() {
        return doubleChance;
    }

    public List<Map<String, String>> getDrawNoBet() {
        return drawNoBet;
    }

    public List<Map<String, String>> getFirstTeamToScore() {
        return firstTeamToScore;
    }

    public List<Map<String, String>> getFullTime() {
        return fullTime;
    }

    public List<Map<String, String>> getMatchGoals() {
        return matchGoals;
    }

    public void setFirstHalf(List<Map<String, String>> firstHalf) {
        this.firstHalf = firstHalf;
    }

    public void setAsianHandicap(List<Map<String, String>> asianHandicap) {
        this.asianHandicap = asianHandicap;
    }

    public void setBothTeamsToScore(List<Map<String, String>> bothTeamsToScore) {
        this.bothTeamsToScore = bothTeamsToScore;
    }

    public void setCardsInMatch(List<Map<String, String>> cardsInMatch) {
        this.cardsInMatch = cardsInMatch;
    }

    public void setCorners2Way(List<Map<String, String>> corners2Way) {
        this.corners2Way = corners2Way;
    }

    public void setDoubleChance(List<Map<String, String>> doubleChance) {
        this.doubleChance = doubleChance;
    }

    public void setDrawNoBet(List<Map<String, String>> drawNoBet) {
        this.drawNoBet = drawNoBet;
    }

    public void setFirstTeamToScore(List<Map<String, String>> firstTeamToScore) {
        this.firstTeamToScore = firstTeamToScore;
    }

    public void setFullTime(List<Map<String, String>> fullTime) {
        this.fullTime = fullTime;
    }

    public void setMatchGoals(List<Map<String, String>> matchGoals) {
        this.matchGoals = matchGoals;
    }
}

