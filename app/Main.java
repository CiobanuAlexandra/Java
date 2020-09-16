package com.app;

import com.utils.MusicPlayerReports;

public class Main {

    public static void main( String[] args) {

            MusicPlayerReports musicPlayer = new MusicPlayerReports();
            musicPlayer.printListOfAllSongs();
            musicPlayer.printListOfSongsListened();
            musicPlayer.printLogsForPlayedSongs();
     }
}



