package com.company;

public class Main {

    public static void main(String[] args) {
        FootballTeam wisla = new FootballTeam("Wisla", 10);
        FootballTeam legia = new FootballTeam("Legia", 30);
        FootballTeam chelmianka = new FootballTeam("Chelmianka", 4);

        BasketballTeam anwil = new BasketballTeam("Anwil", 20);

        League<FootballTeam> ekstraklapa = new League("Ekstraklapa");
        ekstraklapa.addTeam(wisla);
        ekstraklapa.addTeam(legia);
        ekstraklapa.addTeam(chelmianka);
        ekstraklapa.addTeam(chelmianka);
        ekstraklapa.printTabela();
    }
}
