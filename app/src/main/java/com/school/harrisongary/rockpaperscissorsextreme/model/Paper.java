package com.school.harrisongary.rockpaperscissorsextreme.model;

import com.school.harrisongary.rockpaperscissorsextreme.R;
import com.school.harrisongary.rockpaperscissorsextreme.utils.TextUtils;

/**
 * Created by R2D2 on 9/14/2014.
 */
public class Paper implements Gesture{
    @Override
    public int showGestureImage() { return R.drawable.paper; }

    @Override
    public String gestName() { return TextUtils.PAPER;}

    @Override
    public String punToastW() { return TextUtils.ROCKPUNW;}

    @Override
    public String punToastT() { return TextUtils.ROCKPUNT;}

    @Override
    public String punToastL() { return TextUtils.ROCKPUNL;}

    public int GestInt = 2;

}
