package com.blz;

public class SnakeAndLadder {

    public static void main(String[] args) {
        int IS_NOPLAY = 0;
        int IS_SNAKE = 1;
        int IS_LADDER = 2;
        int START_POSITION = 0;
        int WINNING_POSITION = 100;
        int CurrentPosition = START_POSITION;
        int DiceCount = 0;

        System.out.println("welcome to the snake and ladder program");

        while (CurrentPosition < WINNING_POSITION) {
            DiceCount++;
            //Rolling Dice
            int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
            //check for options
            int option = (int) Math.floor(Math.random() * 10) % 3;
            if (option == IS_SNAKE) {

                if (CurrentPosition < 0) {
                    CurrentPosition = START_POSITION;
                } else {
                    CurrentPosition = CurrentPosition - diceNumber;
                    System.out.println("Dice Rolled to---- " + diceNumber + "----Snake---- " + CurrentPosition + " Position");
                }

            } else if (option == IS_LADDER) {
                CurrentPosition = CurrentPosition + diceNumber;
                if (CurrentPosition > WINNING_POSITION) {
                    CurrentPosition = CurrentPosition - diceNumber;
                } else {
                    System.out.println("Dice ROlled to---- " + diceNumber + "----Ladder---- " + CurrentPosition + " Position ");
                }

            } else {
                System.out.println("Dice Rolled to----" + diceNumber + "----NoPlay----" + CurrentPosition + " Position ");
            }
        }

        System.out.println("Player Current position is " + CurrentPosition);

        System.out.println("Dice rolled total " + DiceCount + " times ");

    }
}
