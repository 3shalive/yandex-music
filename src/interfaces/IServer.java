package interfaces;

import classes.Artist;
import classes.Playlist;
import classes.SoundContent;
import classes.User;

import java.util.ArrayList;

public interface IServer {
    User getUser();

    ArrayList<Playlist> getPlaylists();

    ArrayList<Artist> getArtists();

    ArrayList<SoundContent> getSoundContents();
}
