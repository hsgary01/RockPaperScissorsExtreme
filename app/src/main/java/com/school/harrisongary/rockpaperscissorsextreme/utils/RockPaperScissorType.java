package com.school.harrisongary.rockpaperscissorsextreme.utils;

/**
 * Created by R2D2 on 9/20/2014.
 */
public enum RockPaperScissorType {

    ROCK("Rock"), PAPER("Paper"), SCISSORS("Scissors");
    private String value;

    RockPaperScissorType(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }

}
