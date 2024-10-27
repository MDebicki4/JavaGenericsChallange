package com.company;

import java.util.ArrayList;

public class League<T extends Teams> {
    private String name;

    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already in the league " + this.name);
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " is added to league " + this.name);
            return true;
        }

    }

    public void printTabela() {
        for (T t : teams) {
            System.out.println(t.getName() + ": " + t.getScore());
        }
    }
}
