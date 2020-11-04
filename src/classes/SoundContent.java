package classes;

public class SoundContent {
    int id;
    Artist artist;
    String time;
    String name;

    public SoundContent(Artist artist, String time, String name) {
        this.artist = artist;
        this.time = time;
        this.name = name;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
