package classes;

import java.util.ArrayList;

public class MyCollection {
    ArrayList<Track> tracks;
    ArrayList<Playlist> playlists;
    ArrayList<Artist> artists;

    public MyCollection(ArrayList<Track> tracks, ArrayList<Playlist> playlists, ArrayList<Artist> artists) {
        this.tracks = tracks;
        this.playlists = playlists;
        this.artists = artists;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    public ArrayList<Artist> getArtists() {
        return artists;
    }

    public void setArtists(ArrayList<Artist> artists) {
        this.artists = artists;
    }
}
