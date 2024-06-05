package com.betplay.model;

public class Player extends Equipo{
    private String playerName;
    private int dorsal;
    private String position;
    private String nacionality;
    private String dateEntry;
    private int goals;
    private int redCards;
    private int yellowCards;

    public Player() {

    }

    public Player(String name, String playerName, int dorsal, String position, String nacionality, String dateEntry,
            int goals, int redCards, int yellowCards) {
        super(name);
        this.playerName = playerName;
        this.dorsal = dorsal;
        this.position = position;
        this.nacionality = nacionality;
        this.dateEntry = dateEntry;
        this.goals = goals;
        this.redCards = redCards;
        this.yellowCards = yellowCards;
    }

    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getNacionality() {
        return nacionality;
    }
    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }
    public String getDateEntry() {
        return dateEntry;
    }
    public void setDateEntry(String dateEntry) {
        this.dateEntry = dateEntry;
    }
    public int getGoals() {
        return goals;
    }
    public void setGoals(int goals) {
        this.goals = goals;
    }
    public int getRedCards() {
        return redCards;
    }
    public void setRedCards(int redCards) {
        this.redCards = redCards;
    }
    public int getYellowCards() {
        return yellowCards;
    }
    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }
}
