package com.example.android.moodmusicapp;

public class Songs {

    /** name of artist*/

    private String iSinger;

    private String iSingerSong;

    /**
     * crate new Songs object for ListView
     */

    public Songs (String singer, String singerSong){
        iSinger = singer;
        iSingerSong = singerSong;
        }

    /**get singer and singerSong
     *
      */

    public String getSinger(){return iSinger;}

    public  String getSingerSong(){return iSingerSong;}

}
