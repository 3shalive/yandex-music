package app;

import classes.*;
import interfaces.IServer;

import java.util.ArrayList;

public class Server implements IServer {
    @Override
    public User getUser() {
        return new User("User1");
    }

    @Override
    public ArrayList<Playlist> getPlaylists() {
        // создаем мок данные
        Albom albom1 = new Albom("Albom 1", "1997", "Rock");
        ArrayList<SoundContent> soundContents = new ArrayList<SoundContent>();
        SoundContent soundContent1 = new SoundContent(new Artist("Artist 1"), "1:23", "soundContent1");
        soundContents.add(soundContent1);

        Playlist playlist1 = new Playlist(soundContents, albom1);

        ArrayList<Playlist> playlists = new ArrayList<>();

        playlists.add(playlist1);
        return playlists;
    }

    @Override
    public ArrayList<Artist> getArtists() {
        ArrayList<Artist> artists = new ArrayList<Artist>();

        for (int i = 0; i < 10; i++) {
            Artist artist = new Artist("Artist " + i);
            artists.add(artist);
        }

        return artists;
    }

    @Override
    public ArrayList<SoundContent> getSoundContents() {
        ArrayList<SoundContent> soundContents = new ArrayList<SoundContent>();

        ArrayList<Artist> artists = getArtists();

        for (int i = 0; i < 10; i++) {
            SoundContent soundContent = new SoundContent(artists.get(i), "1:23", "sound content " + i);
            soundContents.add(soundContent);
        }

        return soundContents;
    }
}
