package com.blz;

public class SnakeAndLadder {

    public static void main(String[] args) {
        int IS_NOPLAY = 0;
        int IS_SNAKE = 1;
        int IS_LADDER = 2;
        int START_POSITION = 0;
        int WINNING_POSITION = 100;
        int CurrentPosition = START_POSITION;

        System.out.println("welcome to the snake and ladder program");
        while (CurrentPosition < WINNING_POSITION) {
            //Rolling Dice
            int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
            //check for options
            int option = (int) Math.floor(Math.random() * 10) % 3;
            if (option == IS_SNAKE) {

                if (CurrentPosition < 0) {
                    CurrentPosition = START_POSITION;
                } else {
                    CurrentPosition = CurrentPosition - diceNumber;
                    System.out.println("snake option at " + CurrentPosition);
                }
            } else if (option == IS_LADDER) {
                CurrentPosition = CurrentPosition + diceNumber;
                System.out.println("ladder option at " + CurrentPosition);
            } else {
                System.out.println("no play at " + CurrentPosition);
            }
        }
        System.out.println("Player Current position is " + CurrentPosition);

    }
}
