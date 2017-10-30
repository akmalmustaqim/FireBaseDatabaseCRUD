package com.muza.firebasedatabasecrud;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by asus on 30/10/2017.
 */

@IgnoreExtraProperties
public class Artist {
    private String artistId;
    private String artistName;

    public Artist(){

    }

    public Artist(String artistId, String artistName) {
        this.artistId = artistId;
        this.artistName = artistName;

    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }


}