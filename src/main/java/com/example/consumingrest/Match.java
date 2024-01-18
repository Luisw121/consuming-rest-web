package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Match {
    @JsonProperty("Away Score")
    private int awayScore;
    @JsonProperty("Away Team")
    private String awayTeam;
    @JsonProperty("Home Score")
    private int homeScore;
    @JsonProperty("Home Team")
    private String homeTeam;
    @JsonProperty("Initial Away Odd")
    private double initialAwayOdd;
    @JsonProperty("Initial Draw Odd")
    private double initialDrawOdd;
    @JsonProperty("Initial Home Odd")
    private double initialHomeOdd;
    @JsonProperty("League")
    private String league;
    @JsonProperty("League ID")
    private int leagueId;
    @JsonProperty("Live Away Odd")
    private double liveAwayOdd;
    @JsonProperty("Live Draw Odd")
    private double liveDrawOdd;
    @JsonProperty("Live Home Odd")
    private double liveHomeOdd;
    @JsonProperty("Match ID")
    private String matchId;
    @JsonProperty("Status")
    private String status;

    public Match(int awayScore, String awayTeam, int homeScore, String homeTeam, double initialAwayOdd, double initialDrawOdd, double initialHomeOdd, String league, int leagueId, double liveAwayOdd, double liveDrawOdd, double liveHomeOdd, String matchId, String status) {
        this.awayScore = awayScore;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.homeTeam = homeTeam;
        this.initialAwayOdd = initialAwayOdd;
        this.initialDrawOdd = initialDrawOdd;
        this.initialHomeOdd = initialHomeOdd;
        this.league = league;
        this.leagueId = leagueId;
        this.liveAwayOdd = liveAwayOdd;
        this.liveDrawOdd = liveDrawOdd;
        this.liveHomeOdd = liveHomeOdd;
        this.matchId = matchId;
        this.status = status;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public double getInitialAwayOdd() {
        return initialAwayOdd;
    }

    public double getInitialDrawOdd() {
        return initialDrawOdd;
    }

    public double getInitialHomeOdd() {
        return initialHomeOdd;
    }

    public String getLeague() {
        return league;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public double getLiveAwayOdd() {
        return liveAwayOdd;
    }

    public double getLiveDrawOdd() {
        return liveDrawOdd;
    }

    public double getLiveHomeOdd() {
        return liveHomeOdd;
    }

    public String getMatchId() {
        return matchId;
    }

    public String getStatus() {
        return status;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setInitialAwayOdd(double initialAwayOdd) {
        this.initialAwayOdd = initialAwayOdd;
    }

    public void setInitialDrawOdd(double initialDrawOdd) {
        this.initialDrawOdd = initialDrawOdd;
    }

    public void setInitialHomeOdd(double initialHomeOdd) {
        this.initialHomeOdd = initialHomeOdd;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public void setLiveAwayOdd(double liveAwayOdd) {
        this.liveAwayOdd = liveAwayOdd;
    }

    public void setLiveDrawOdd(double liveDrawOdd) {
        this.liveDrawOdd = liveDrawOdd;
    }

    public void setLiveHomeOdd(double liveHomeOdd) {
        this.liveHomeOdd = liveHomeOdd;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
