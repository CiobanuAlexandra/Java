package com.utils;

import java.util.Map;

public class MusicPlayerReports {
    MusicPlayer musicPlayer = new MusicPlayer();

    public void printListOfAllSongs(){
        System.out.println ( "List of all songs in the playlist: " );
        for (String songName : musicPlayer.generateSongs())
            System.out.println (songName);
        System.out.println ( "------------------------" );
    }

    public void printListOfSongsListened (){
        System.out.println ( "List of songs listened:" );
        for (String songName : musicPlayer.generateListenedSongs())
            System.out.println (songName);
        System.out.println ( "------------------------" );
    }

    public void printLogsForPlayedSongs(){
        System.out.println ( "Logs for played songs:" );
        for (Map.Entry<String,Integer> entries : musicPlayer.generatePlayedSongsLogs().entrySet ())
            System.out.println ("The song "+ entries.getKey ()+" was repeated "+ entries.getValue () + " times");
    }
}

