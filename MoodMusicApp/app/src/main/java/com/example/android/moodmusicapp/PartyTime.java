package com.example.android.moodmusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PartyTime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_to_choose_and_play_activity);

        // set onClickListener to go back to main screen

        Button Mood = findViewById(R.id.Choose_your_mood);
        Mood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //Create an ArrayList of Songs

        // Create a list of words
        final ArrayList<Songs> songsAndArtist = new ArrayList<>();
        songsAndArtist.add(new Songs("PartyTime Artist 1","Song no. 1"));
        songsAndArtist.add(new Songs("PartyTime Artist 2", "Song no. 2"));
        songsAndArtist.add(new Songs("PartyTime Artist 3", "Song no. 3"));
        songsAndArtist.add(new Songs("PartyTime Artist 4", "Song no. 4"));
        songsAndArtist.add(new Songs("PartyTime Artist 5", "Song no. 5"));
        songsAndArtist.add(new Songs("PartyTime Artist 6", "Song no. 6"));
        songsAndArtist.add(new Songs("PartyTime Artist 7", "Song no. 7"));
        songsAndArtist.add(new Songs("PartyTime Artist 8", "Song no. 8"));
        songsAndArtist.add(new Songs("PartyTime Artist 9", "Song no. 9"));
        songsAndArtist.add(new Songs("PartyTime Artist 10", "Song no. 10"));
        songsAndArtist.add(new Songs("PartyTime Artist 11", "Song no. 11"));
        songsAndArtist.add(new Songs("PartyTime Artist 12", "Song no 12"));
        SongAdapter songsAdapter = new SongAdapter(this, songsAndArtist);

        ListView listView = findViewById(R.id.listOfSongs);

        listView.setAdapter(songsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView artist = findViewById(R.id.actual_playing_Singer);
                artist.setText(songsAndArtist.get(position).getSinger());
                TextView song = findViewById(R.id.actual_playing_Song );
                song.setText(songsAndArtist.get(position).getSingerSong());
            }
        });
    }
}