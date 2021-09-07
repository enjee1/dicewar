package com.company;

import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players = new ArrayList<Player>();
    private int numRounds;
    private int numDice;
    private Player winner;

    public Game(int numOfPlayers, int numRounds, int numDice) {
        this.numRounds = numRounds;
        this.numDice = numDice;
        generatePlayers(numOfPlayers);

    }

    private void playerTurn(Player player) {

    }

    public void startGame() {

    }

    private void generatePlayers(int numPlayers) {
        for (int i = 0; i < numPlayers ; i++) {
            String name = CLI.getString("Enter your name\nName: ");
            Player newPlayer = new Player(name);
        }
    }

    private ArrayList<Die> generateDice() {
        return null;
    }
}
