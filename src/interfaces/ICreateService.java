package interfaces;

import classes.Artist;
import classes.Playlist;
import classes.SoundContent;

public interface ICreateService {
    SoundContent createSoundContent();

    Playlist createPlaylist();

    Artist createArtist();
}
