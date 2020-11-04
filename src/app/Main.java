package app;

import GUI.CreateArtistForm;
import GUI.ShowArtistListWindow;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start yandex-app");
        Server server = new Server();

        //test GUI
        new CreateArtistForm(server);
        new ShowArtistListWindow(server);
    }
}
