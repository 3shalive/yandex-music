package interfaces;

import classes.Albom;
import classes.Artist;
import classes.Playlist;
import classes.SoundContent;

import java.util.ArrayList;

public interface ICreateService {
    SoundContent createSoundContent(Artist artist, String time, String name);

    Playlist createPlaylist(ArrayList<SoundContent> soundContents, Albom albom);

    Artist createArtist(String name);
}
