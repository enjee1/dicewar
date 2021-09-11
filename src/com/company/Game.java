package com.company;

import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players = new ArrayList<Player>();
    private int numRounds;
    private int numDice;
//    private Player winner;
    //TODO: Modify winner to include multiple winners

    public Game(int numOfPlayers, int numRounds, int numDice) {
        this.numRounds = numRounds;
        this.numDice = numDice;
        generatePlayers(numOfPlayers);
        startGame();
    }

    private void playerTurn(Player player) {
        int sum = 0;
        ArrayList<Die> playerCurrentRoll = player.rollHand();

        for (Die die: playerCurrentRoll) {
            die.roll();
            sum += die.getValue();
            System.out.println(player.getName() + " rolled " + die.getValue());
        }
        int newScore = sum + player.getScore();

        player.setScore(newScore);
        System.out.println(player.getName() + "'s total score is: " + newScore);
    }

    public void startGame() {
        for (int i = 0; i < numRounds; i++) {
            for (Player player : players) {
                playerTurn(player);
            }
        }
    }

    private void generatePlayers(int numPlayers) {
        for (int i = 0; i < numPlayers ; i++) {
            String name = CLI.getString("Player " + (i + 1) + ", enter your name\nName: ");
            Player newPlayer = new Player(name, 0);
            players.add(newPlayer);
            Hand hand = new Hand();
            ArrayList<Die> newDice = generateDice();
            hand.setDice(newDice);
            newPlayer.setHand(hand);
        }
    }

    private ArrayList<Die> generateDice() {
        ArrayList<Die> tempArr = new ArrayList<Die>();

        for (int i = 0; i < numDice; i++) {
            Die newDie = new Die(6);
            tempArr.add(newDie);
        }
        return tempArr;
    }
}
