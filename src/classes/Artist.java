package classes;

import java.util.ArrayList;

public class Artist {
    int id;
    String name;
    int likes;
    ArrayList<Albom> alboms;
    ArrayList<UpcomingConcert> upcomingConcerts;

    public Artist(String name) {
        this.name = name;
        this.likes = 0;
        this.alboms = new ArrayList<Albom>();
        this.upcomingConcerts = new ArrayList<UpcomingConcert>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Albom> getAlboms() {
        return alboms;
    }

    public void setAlboms(ArrayList<Albom> alboms) {
        this.alboms = alboms;
    }

    public ArrayList<UpcomingConcert> getUpcomingConcerts() {
        return upcomingConcerts;
    }

    public void setUpcomingConcerts(ArrayList<UpcomingConcert> upcomingConcerts) {
        this.upcomingConcerts = upcomingConcerts;
    }
}
