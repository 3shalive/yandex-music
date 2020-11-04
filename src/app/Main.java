package app;

import GUI.CreateArtistForm;
import classes.Albom;
import classes.Artist;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start yandex-app");
        Server server = new Server();

        //test GUI
        new CreateArtistForm(server);
    }
}
