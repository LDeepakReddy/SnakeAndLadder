package com.blz;

public class SnakeAndLadder {

    public static void main(String[] args) {
        int START_POSITION = 0;

        System.out.println("welcome to the snake and ladder program");
        System.out.println("Player started at " + START_POSITION);

        //Rolling Dice
        int diceNumber=(int) Math.floor(Math.random()*10) % 6 + 1;
        System.out.println("Die Rolled : " +diceNumber);

    }
}
