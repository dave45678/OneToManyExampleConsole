// example illustrating how to display an artist's collection of songs
package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        //create an artist
        //the constructor of the artist initialized an empty set of songs
        Artist artist = new Artist();
        artist.setId(1);
        artist.setFullName("Robert Rihmeek Williams");
        artist.setStageName("Meek Mill");


        //create a song
        Song song = new Song();
        song.setId(10);
        song.setTitle("Amen");

        //add the song to the collection
        artist.addSong(song);

        //create another song
        song = new Song();
        song.setId(20);
        song.setTitle("Burn");
        //add the song to the collection
        artist.addSong(song);


        //create another song
        song = new Song();
        song.setId(30);
        song.setTitle("Believe it");
        //add the song to the collection
        artist.addSong(song);


        //display the artist
        System.out.println(artist.getStageName());
        //List the songs
        for( Song s:artist.getSongs()){
            System.out.print("   ");
            System.out.print(s.getTitle());
            System.out.println();
        }





    }
}
