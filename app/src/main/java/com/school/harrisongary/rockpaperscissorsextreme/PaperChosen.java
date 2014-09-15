package com.school.harrisongary.rockpaperscissorsextreme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.school.harrisongary.rockpaperscissorsextreme.factory.GestureFactory;
import com.school.harrisongary.rockpaperscissorsextreme.model.Gesture;
import com.school.harrisongary.rockpaperscissorsextreme.utils.TextUtils;


public class PaperChosen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper_chosen);




        Gesture gesture = GestureFactory.getInstance();
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setImageResource(gesture.showGestureImage());

        String gestRoll = gesture.gestName();




        if (gestRoll.equals("ROCK")) {

            Toast toast = Toast.makeText(getApplicationContext(), "YOU WIN: Looks like you got this all WRAPPED up.", Toast.LENGTH_LONG);
            toast.show();
        }
        else if (gestRoll.equals("PAPER")) {
            Toast toast = Toast.makeText(getApplicationContext(), "TIE: At least you didn't get a PAPER cut.", Toast.LENGTH_LONG);
            toast.show();
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), "YOU LOSE: You've been CUT into pieces over this game.", Toast.LENGTH_LONG);
            toast.show();
        }








    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.paper_chosen, menu);
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
