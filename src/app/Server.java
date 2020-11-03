package app;

import classes.*;
import interfaces.IServer;

import java.util.ArrayList;

public class Server implements IServer {
    private ArrayList<SoundContent> soundContents = new ArrayList<SoundContent>();
    private ArrayList<Artist> artists = new ArrayList<Artist>();
    private ArrayList<Playlist> playlists = new ArrayList<Playlist>();

    Server() {
        init();
    }

    void init() {
        // создаем артистов и их треки
        for (int i = 0; i < 10; i++) {
            Artist artist = new Artist("Artist: " + i);
            for (int j = 0; j < 10; j++) {
                SoundContent soundContent = new SoundContent(artist, "1:23", "soundContent " + j + " by " + artist.getName());
                soundContents.add(soundContent);
            }
            artists.add(artist);
        }

        // создаем плейлисты
        for (int i = 0; i < 10; i++) {
            Albom albom = new Albom("albom " + i, "1997 " + i, "Rock " + i);
            Playlist playlist = new Playlist(this.soundContents, albom);
            playlists.add(playlist);
        }
    }

    @Override
    public User getUser() {
        return new User("User1");
    }

    @Override
    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    @Override
    public ArrayList<Artist> getArtists() {
        return artists;
    }

    @Override
    public ArrayList<SoundContent> getSoundContents() {
        return soundContents;
    }
}
