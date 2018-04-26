package com.company;

import java.util.HashSet;

public class Artist {
    private int id;
    private String fullName;
    private String stageName;
    private HashSet<Song> songs;

    public Artist() {
        //initialize the collection of songs
        songs = new HashSet<Song>();
    }

    public HashSet<Song> getSongs() {
        return songs;
    }

    public void setSongs(HashSet<Song> songs) {
        this.songs = songs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }
    public void addSong(Song s){
        songs.add(s);
    }


}
