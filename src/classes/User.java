package classes;

import java.util.ArrayList;

public class User {
    int id;
    private String Name;
    private MyCollection myCollection;

    public User(String name) {
        Name = name;

        ArrayList<SoundContent> myCollectionTracks = new ArrayList<SoundContent>();
        ArrayList<Playlist> myCollectionPlaylists = new ArrayList<Playlist>();
        ArrayList<Artist> myCollectionArtists = new ArrayList<Artist>();

        myCollection = new MyCollection(myCollectionTracks, myCollectionPlaylists, myCollectionArtists);
    }

    void addSoundContentToMyCollection(SoundContent soundContent) {
        myCollection.addSoundContent(soundContent);
    }

    ;

    void addPlaylistToMyCollection(Playlist playlist) {
        myCollection.addPlaylist(playlist);
    }

    ;

    void addSoundContentToMyCollection(Artist artist) {
        myCollection.addArtist(artist);
    }

    ;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public MyCollection getMyCollection() {
        return myCollection;
    }

    public void setMyCollection(MyCollection myCollection) {
        this.myCollection = myCollection;
    }
}
