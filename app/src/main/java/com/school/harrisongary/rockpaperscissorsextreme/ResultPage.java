package com.school.harrisongary.rockpaperscissorsextreme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.school.harrisongary.rockpaperscissorsextreme.factory.GestureFactory;
import com.school.harrisongary.rockpaperscissorsextreme.model.Gesture;
import com.school.harrisongary.rockpaperscissorsextreme.utils.RockPaperScissorsUtil;


public class ResultPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);

        Intent intent = getIntent();
        int clickedType = intent.getIntExtra(RockPaperScissorsUtil.INPUT_TYPE, 0);

        Gesture gesture = GestureFactory.getInstance();
        ImageView imageView = (ImageView) findViewById(R.id.imageView6);
        imageView.setImageResource(gesture.showGestureImage());

        String gestRoll = gesture.gestName();


        if (clickedType == R.id.imageButtonR) { //Rock Chosen

            ImageView imageView2 = (ImageView) findViewById(R.id.imageView);
            imageView2.setImageResource(R.drawable.rock);



            if (gestRoll.equals("ROCK")) {

                Toast toast = Toast.makeText(getApplicationContext(), "Looks like you're stuck between a ROCK and a hard place.", Toast.LENGTH_LONG);
                toast.show();

                TextView textView = (TextView) findViewById(R.id.textResult);
                textView.setText("Tie");



            } else if (gestRoll.equals("PAPER")) {
                Toast toast = Toast.makeText(getApplicationContext(), "You lost to paper... How does that even work?", Toast.LENGTH_LONG);
                toast.show();

                TextView textView = (TextView) findViewById(R.id.textResult);
                textView.setText("Lose");



            } else {
                Toast toast = Toast.makeText(getApplicationContext(), "ROCK And Roll!", Toast.LENGTH_LONG);
                toast.show();

                TextView textView = (TextView) findViewById(R.id.textResult);
                textView.setText("Win");

            }


        } else if (clickedType == R.id.imageButtonP) { //Paper Chosen

            ImageView imageView2 = (ImageView) findViewById(R.id.imageView);
            imageView2.setImageResource(R.drawable.paper);

            if (gestRoll.equals("ROCK")) {

                Toast toast = Toast.makeText(getApplicationContext(), "YOU WIN: Looks like you got this all WRAPPED up.", Toast.LENGTH_LONG);
                toast.show();
                TextView textView = (TextView) findViewById(R.id.textResult);
                textView.setText("Win");
            } else if (gestRoll.equals("PAPER")) {
                Toast toast = Toast.makeText(getApplicationContext(), "TIE: At least you didn't get a PAPER cut.", Toast.LENGTH_LONG);
                toast.show();
                TextView textView = (TextView) findViewById(R.id.textResult);
                textView.setText("Tie");
            } else {
                Toast toast = Toast.makeText(getApplicationContext(), "YOU LOSE: You've been CUT into pieces over this game.", Toast.LENGTH_LONG);
                toast.show();
                TextView textView = (TextView) findViewById(R.id.textResult);
                textView.setText("Lose");
            }
        }

        else if (clickedType == R.id.imageButtonS) {

            ImageView imageView2 = (ImageView) findViewById(R.id.imageView);
            imageView2.setImageResource(R.drawable.scissors);


            if (gestRoll.equals("ROCK")) {

                Toast toast = Toast.makeText(getApplicationContext(), "YOU LOSE: You got ROCKED.", Toast.LENGTH_LONG);
                toast.show();
                TextView textView = (TextView) findViewById(R.id.textResult);
                textView.setText("Lose");
            } else if (gestRoll.equals("PAPER")) {
                Toast toast = Toast.makeText(getApplicationContext(), "YOU WIN: You are a CUT above the rest.", Toast.LENGTH_LONG);
                toast.show();
                TextView textView = (TextView) findViewById(R.id.textResult);
                textView.setText("Win");
            } else {
                Toast toast = Toast.makeText(getApplicationContext(), "TIE: Guess you didn't make the CUT.", Toast.LENGTH_LONG);
                toast.show();
                TextView textView = (TextView) findViewById(R.id.textResult);
                textView.setText("Tie");
            }
        }
    }









    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.result_page, menu);
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
