package com.example.android.moodmusicapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class songs_information extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_to_choose_and_play_activity);


        String nameOfArtist  = "artistName";
        String nameOfSong = "songName";
        nameOfArtist = getIntent().getStringExtra( nameOfArtist );
        nameOfSong = getIntent().getStringExtra( nameOfSong);

        TextView artist = findViewById( R.id.actual_playing_Singer );
        artist.setText( nameOfArtist );

        TextView song = findViewById( R.id.actual_playing_Song );
        song.setText( nameOfSong );

    }
}
