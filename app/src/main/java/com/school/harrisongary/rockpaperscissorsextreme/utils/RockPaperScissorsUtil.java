package com.school.harrisongary.rockpaperscissorsextreme.utils;

/**
 * Created by R2D2 on 9/20/2014.
 */
public class RockPaperScissorsUtil {

    public static final String INPUT_TYPE = "com.school.harrisongary.rockpaperscissorsextreme.inputType";

    public static String eval(RockPaperScissorType player1Choice, RockPaperScissorType player2Choice) {
        if (player1Choice == player2Choice) {
            return "Tie";
        } else {
            if (player1Choice == RockPaperScissorType.ROCK) {
                if (player2Choice == RockPaperScissorType.SCISSORS) {
                    return "Player 1 Wins";

                } else {
                    return "Computer Wins";
                }
            } else if (player1Choice == RockPaperScissorType.SCISSORS) {//scissors beats paper
                if (player2Choice == RockPaperScissorType.PAPER) {
                    return "Player 1 Wins";
                } else {
                    return "Computer Wins";
                }
            } else {//paper
                if (player2Choice == RockPaperScissorType.ROCK) {//paper beats rock
                    return "Player 1 Wins";
                } else {
                    return "Computer Wins";
                }


            }
        }
    }
}
