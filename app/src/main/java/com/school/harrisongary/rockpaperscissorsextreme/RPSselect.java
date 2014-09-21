package com.school.harrisongary.rockpaperscissorsextreme;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.school.harrisongary.rockpaperscissorsextreme.factory.GestureFactory;
import com.school.harrisongary.rockpaperscissorsextreme.model.Gesture;
import com.school.harrisongary.rockpaperscissorsextreme.utils.RockPaperScissorsUtil;


public class RPSselect extends Activity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpsselect);

        ImageView imageViewRock = (ImageView)findViewById(R.id.imageButtonR);
        imageViewRock.setOnClickListener(this);

        ImageView imageViewPaper = (ImageView)findViewById(R.id.imageButtonP);
        imageViewPaper.setOnClickListener(this);

        ImageView imageViewScissors = (ImageView)findViewById(R.id.imageButtonS);
        imageViewScissors.setOnClickListener(this);




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.rpsselect, menu);
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


    @Override
    public void onClick(View view) {
        Intent intent = new Intent (this, ResultPage.class);
        intent.putExtra(RockPaperScissorsUtil.INPUT_TYPE,view.getId());
        startActivity(intent);

    }
}
