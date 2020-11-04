package app;

import GUI.CreateArtistForm;
import classes.Albom;
import classes.Artist;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start yandex-app");
        Server server = new Server();

        // test
        System.out.println("create model test");
        Artist artist = server.createArtist("new Artist");
        System.out.println(artist.getName());

        ArrayList<Albom> alboms = new ArrayList<Albom>();
        alboms.add(new Albom(server.genPlaylistId(), "Playlist 1", "1997", "Rap", artist));

        artist.setAlboms(alboms);

        System.out.println(artist.getAlboms().get(0).getGenre());

        //test GUI
        new CreateArtistForm();

    }
}
