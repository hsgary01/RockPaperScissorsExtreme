package com.school.harrisongary.rockpaperscissorsextreme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.school.harrisongary.rockpaperscissorsextreme.factory.GestureFactory;
import com.school.harrisongary.rockpaperscissorsextreme.model.Gesture;


public class ScissorsChosen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scissors_chosen);

        Gesture gesture = GestureFactory.getInstance();
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setImageResource(gesture.showGestureImage());

        String gestRoll = gesture.gestName();




        if (gestRoll.equals("ROCK")) {

            Toast toast = Toast.makeText(getApplicationContext(), "YOU LOSE: You got ROCKED.", Toast.LENGTH_LONG);
            toast.show();
        }
        else if (gestRoll.equals("PAPER")) {
            Toast toast = Toast.makeText(getApplicationContext(), "YOU WIN: You are a CUT above the rest.", Toast.LENGTH_LONG);
            toast.show();
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), "TIE: Guess you didn't make the CUT.", Toast.LENGTH_LONG);
            toast.show();
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.scissors_chosen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void titleScreen (View view) {
        Intent intent = new Intent(this, RPSselect.class);

        startActivity(intent);


    }
}
