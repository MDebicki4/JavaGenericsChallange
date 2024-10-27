package com.company;

public abstract class Teams {
    public String name;
    public int score;

    public Teams(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

}
