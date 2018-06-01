package com.example.android.moodmusicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Songs> {


    public SongAdapter(Activity context, ArrayList<Songs> SongsAndSingers) {
        super(context, 0, SongsAndSingers);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listSongsView = convertView;
        if (listSongsView == null) {
            listSongsView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_songs, parent, false);
        }
        // get the objects located at this position in the list

        Songs currentSongs = getItem(position);

        //find the text view id in playing activity

        final TextView singerTextView = listSongsView.findViewById(R.id.singer_number);
        singerTextView.setText(currentSongs.getSinger());

        final TextView songsTextView = listSongsView.findViewById(R.id.song_number);
        songsTextView.setText(currentSongs.getSingerSong());

        return  listSongsView;
    }
}

