package com.school.harrisongary.rockpaperscissorsextreme.factory;


import android.util.Log;


import com.school.harrisongary.rockpaperscissorsextreme.model.Gesture;
import com.school.harrisongary.rockpaperscissorsextreme.model.Paper;
import com.school.harrisongary.rockpaperscissorsextreme.model.Rock;
import com.school.harrisongary.rockpaperscissorsextreme.model.Scissors;

import java.util.Date;
import java.util.Random;

/**
 * Created by R2D2 on 9/14/2014.
 */
public class GestureFactory {
    private static int number = 1;
    private GestureFactory(){}
    public static Gesture getInstance() {
        Random randomGenerator = new Random(new Date().getTime() + number++);
        int val = randomGenerator.nextInt(3);//up to four but not including
        Log.d("gesture", "gesture number: " + val);
        switch (val) {
            case 1:
                return new Rock();
            case 2:
                return new Paper();
            default:
                return new Scissors();
        }
    }
}