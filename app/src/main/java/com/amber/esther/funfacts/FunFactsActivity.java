package com.amber.esther.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare view variables
        final TextView factLabel = (TextView) findViewById(R.id.factsTextView);
        final Button showfactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout layoutBackground = (RelativeLayout) findViewById(R.id.backgroundLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();
                // Update the label with our dynamic fact
                factLabel.setText(fact);

                // change layout color
                int color = mColorWheel.getColor();
                layoutBackground.setBackgroundColor(color);
                showfactButton.setTextColor(color);
            }
        };

        showfactButton.setOnClickListener(listener);
//      Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show();

        Log.d(TAG, "we're logging from the onCreate() method");
    }
}
