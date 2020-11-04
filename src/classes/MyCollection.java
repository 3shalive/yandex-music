package classes;

import java.util.ArrayList;

public class MyCollection {
    int id;
    ArrayList<SoundContent> tracks;
    ArrayList<Playlist> playlists;
    ArrayList<Artist> artists;

    public MyCollection(ArrayList<SoundContent> tracks, ArrayList<Playlist> playlists, ArrayList<Artist> artists) {
        this.tracks = tracks;
        this.playlists = playlists;
        this.artists = artists;
    }

    void addSoundContent(SoundContent soundContent){
        tracks.add(soundContent);
    };

    void addPlaylist(Playlist playlist){
        playlists.add(playlist);
    };

    void addArtist(Artist artist){
        artists.add(artist);
    };

    public ArrayList<SoundContent> getTracks() {
        return tracks;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public ArrayList<Artist> getArtists() {
        return artists;
    }
}
