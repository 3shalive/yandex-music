package classes;

import java.util.ArrayList;

public class User {
    String Name;
    MyCollection myCollection;

    public User(String name) {
        Name = name;

        ArrayList<Track> myCollectionTracks = new ArrayList<Track>();
        ArrayList<Playlist> myCollectionPlaylists = new ArrayList<Playlist>();
        ArrayList<Artist> myCollectionArtists = new ArrayList<Artist>();

        myCollection = new MyCollection(myCollectionTracks, myCollectionPlaylists, myCollectionArtists);
    }

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
