package interfaces;

import classes.Albom;
import classes.Artist;
import classes.Playlist;
import classes.SoundContent;

import java.util.ArrayList;

public interface IReadService {
    SoundContent getSoundContentById(int id);
    ArrayList<Playlist> getAllSoundContent();

    Playlist getPlaylistById(int id);
    Playlist getPlaylistByArtist(Artist artist);
    Playlist getPlaylistByAlbom(Albom albom);
    ArrayList<Playlist> getAllPlaylists();

    Artist getArtistByName(String name);
    ArrayList<Playlist> getAllArtist();
}
