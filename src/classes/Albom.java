package classes;

public class Albom {
    int id;
    String name;
    String year;
    String genre;
    Artist artist;

    public Albom(int id, String name, String year, String genre, Artist artist) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }
}
