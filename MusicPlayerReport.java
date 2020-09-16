package com.jetbrains;

import java.util.Map;

public class MusicPlayerReport {

    private  MusicPlayer musicPlayer;

    public void printListOfAllSongs(){
        System.out.println ( "List of all songs in the playlist: " );
        for (String songName : MusicPlayer.printSongs())
            System.out.println (songName);
        System.out.println ( "------------------------" );
    }

    public void printListOfSongsListened (){
        System.out.println ( "List of songs listened:" );
        for (String songName : MusicPlayer.printListenedSongs())
            System.out.println (songName);
        System.out.println ( "------------------------" );
    }

    public void printLogsForPlayedSongs(){
        System.out.println ( "Logs for played songs:" );
        for (Map.Entry<String,Integer> entries : MusicPlayer.printPlayedSongsLogs ().entrySet ())
            System.out.println ("The song "+ entries.getKey ()+" was repeated "+ entries.getValue () + " times");
    }
}

