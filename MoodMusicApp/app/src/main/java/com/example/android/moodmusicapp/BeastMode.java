package com.example.android.moodmusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BeastMode extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_to_choose_and_play_activity);

        //Create an ArrayList of Songs

        // Create a list of words
        ArrayList<Songs> songsAndArtist = new ArrayList<>();
        songsAndArtist.add(new Songs("Beast Artist 1","Song no. 1"));
        songsAndArtist.add(new Songs("Beast Artist 2", "Song no. 2"));
        songsAndArtist.add(new Songs("Beast Artist 3", "Song no. 3"));
        songsAndArtist.add(new Songs("Beast Artist 4", "Song no. 4"));
        songsAndArtist.add(new Songs("Beast Artist 5", "Song no. 5"));
        songsAndArtist.add(new Songs("Beast Artist 6", "Song no. 6"));
        songsAndArtist.add(new Songs("Beast Artist 7", "Song no. 7"));
        songsAndArtist.add(new Songs("Beast Artist 8", "Song no. 8"));
        songsAndArtist.add(new Songs("Beast Artist 9", "Song no. 9"));
        songsAndArtist.add(new Songs("Beast Artist 10", "Song no. 10"));
        songsAndArtist.add(new Songs("Beast Artist 11", "Song no. 11"));
        songsAndArtist.add(new Songs("Beast Artist 12", "Song no 12"));
        SongAdapter songsAdapter = new SongAdapter(this, songsAndArtist);

        ListView listView = findViewById(R.id.listOfSongs);

        listView.setAdapter(songsAdapter);
    }
}