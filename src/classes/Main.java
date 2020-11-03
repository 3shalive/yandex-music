package classes;

import app.Server;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start yandex-app");
        Server server = new Server();

        System.out.println(server.getArtists().get(2).getName());

    }
}
