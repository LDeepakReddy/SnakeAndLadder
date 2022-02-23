package com.blz;

import java.security.PrivateKey;

public class SnakeAndLadder {
    public static final int IS_NOPLAY = 0;
    public static final int IS_SNAKE = 1;
    public static final int IS_LADDER = 2;
    public static final int START_POSITION = 0;
    public static final int WINNING_POSITION = 100;
    private static String turn = "player1";


    public static void main(String[] args) {
        int DiceCount = 0;
        int CurrentPositionOfPlayer1 = START_POSITION;
        int CurrentPositionOfPlayer2 = START_POSITION;
        System.out.println("welcome to the snake and ladder program");

        while (CurrentPositionOfPlayer1 < WINNING_POSITION && CurrentPositionOfPlayer2 < WINNING_POSITION) {
            DiceCount++;
            if (turn.equals("player1")) {
                CurrentPositionOfPlayer1 = GetPosition(CurrentPositionOfPlayer1);
                turn = "player2";


            } else {
                CurrentPositionOfPlayer2 = GetPosition(CurrentPositionOfPlayer2);
                turn = "player1";


            }
        }
        System.out.println("currentPositionOfPlayer1 " + CurrentPositionOfPlayer1);
        System.out.println("currentPositionOfPlayer2 " + CurrentPositionOfPlayer2);
        if (CurrentPositionOfPlayer1 == WINNING_POSITION) {
            System.out.println("Player 1 won the game");
        } else {
            System.out.println("Player 2 won the game");
        }
    }


    private static int GetPosition(int CurrentPosition) {
        //Rolling Dice
        int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
        //check for options
        int option = (int) Math.floor(Math.random() * 10) % 3;
        if (option == IS_SNAKE) {

            if (CurrentPosition < 0) {
                CurrentPosition = START_POSITION;
            } else {
                CurrentPosition = CurrentPosition - diceNumber;

            }

        } else if (option == IS_LADDER) {
            CurrentPosition = CurrentPosition + diceNumber;
            if (CurrentPosition > WINNING_POSITION) {
                CurrentPosition = CurrentPosition - diceNumber;
            } else {

            }
            if (turn.equals("player1")) {
                turn = "player1";
                System.out.println("player1");
            } else if (turn.equals("player2")) {
                turn = "player2";
                System.out.println("player2");
            }
        } else {


        }
        return CurrentPosition;
    }

}


