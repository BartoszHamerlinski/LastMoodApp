package com.example.android.moodmusicapp;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Find ChillAndRelax mood ImageView by Id and then set onClickListener

        ImageView Chill = findViewById(R.id.chillAndRelax);
        Chill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link ChillAndRelax}
                Intent chill = new Intent(MainActivity.this, ChillAndRelax.class);
                startActivity(chill);
            }
        });

        //Find BeastMode mood ImageView and set onClickListener

        ImageView Beast = findViewById(R.id.beastMode);
        Beast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beast = new Intent(MainActivity.this, BeastMode.class);
                startActivity(beast);
            }
        });
//Find BeastMode mood ImageView and set onClickListener

        ImageView Concentration = findViewById(R.id.concentration);
        Concentration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent concentration = new Intent(MainActivity.this, Concentration.class);
                startActivity(concentration);
            }
        });

        //Find BeastMode mood ImageView and set onClickListener

        ImageView Party = findViewById(R.id.partyTime);
        Party.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent party = new Intent(MainActivity.this, PartyTime.class);
                startActivity(party);
            }
        });
    }
}
