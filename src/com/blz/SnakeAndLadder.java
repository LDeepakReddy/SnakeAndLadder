package com.blz;

public class SnakeAndLadder {

    public static void main(String[] args) {
        int IS_NOPLAY = 0;
        int IS_SNAKE = 1;
        int IS_LADDER = 2;
        int START_POSITION = 0;
        int CurrentPosition = START_POSITION;

        System.out.println("welcome to the snake and ladder program");
        //Rolling Dice
        int diceNumber=(int) Math.floor(Math.random()*10) % 6 + 1;
        //check for options
        int option = (int) Math.floor(Math.random() * 10) % 3;
        if (option == IS_SNAKE) {
            CurrentPosition = CurrentPosition - diceNumber;
            System.out.println("snake option");
        }else if (option == IS_LADDER) {
            CurrentPosition = CurrentPosition + diceNumber;
            System.out.println("ladder option");
        }else {
            System.out.println("no play");
        }
        System.out.println("Player Current position is " + CurrentPosition);

    }
}
