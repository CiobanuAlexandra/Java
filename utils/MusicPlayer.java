package com.utils;

import com.model.Song;

import java.util.*;

public class MusicPlayer {

    private List<Song> listOfItems = new ArrayList<> ();
    private List<String> nameOfSongs = new ArrayList<> ();
    private List<Song> historyOfItemsListened = new ArrayList<>();
    private List<String> namesOfListenedSongs = new ArrayList<> ();
    private Set<Song> songsListened = new HashSet<>();
    private List<String> namesOfAllListenedSongs = new ArrayList<> ();
    private Map<String , Integer> playedSongsLogs = new HashMap<>();

    public List<String> generateSongs() {

        //        Add songs to playlist
        listOfItems.add ( new Song ( "Cum era", 3, false ) );
        listOfItems.add ( new Song ( "Intamplator", 4, false ) );
        listOfItems.add ( new Song ( "Ce mai faci, straine?", 3, false ) );
        listOfItems.add ( new Song ( "Karma", 2, false ) );
        listOfItems.add ( new Song ( "Luna alba", 4, false ) );
        listOfItems.add ( new Song ( "Dorul", 5, false ) );

        for (Song item : listOfItems)
            nameOfSongs.add ( item.getName () );
        return nameOfSongs;
    }
    public  List<String> generateListenedSongs(){

        listOfItems.get ( 0 ).setWasListened ( true );
        listOfItems.get ( 2 ).setWasListened ( true );
        listOfItems.get ( 3 ).setWasListened ( true );
        listOfItems.get ( 5 ).setWasListened ( true );

        //History of listened songs
        historyOfItemsListened.add ( listOfItems.get ( 0 ) );
        historyOfItemsListened.add ( listOfItems.get ( 3 ) );
        historyOfItemsListened.add ( listOfItems.get ( 2 ) );
        historyOfItemsListened.add ( listOfItems.get ( 3 ) );
        historyOfItemsListened.add ( listOfItems.get ( 5 ) );
        historyOfItemsListened.add ( listOfItems.get ( 5 ) );
        historyOfItemsListened.add ( listOfItems.get ( 0 ));

        for (Song song :historyOfItemsListened)
            songsListened.add (song);
        for (Song setSong : songsListened)
            namesOfListenedSongs.add ( setSong.getName () );

        return namesOfListenedSongs;
    }

    public  Map<String, Integer> generatePlayedSongsLogs(){

        for(Song song : historyOfItemsListened)
            namesOfAllListenedSongs.add(song.getName ());

        for (String song : namesOfAllListenedSongs){
            playedSongsLogs.put ( song, Collections.frequency (namesOfAllListenedSongs ,song) );
        }

        return playedSongsLogs;
    }


}
