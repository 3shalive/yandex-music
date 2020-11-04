package app;

import classes.*;
import interfaces.*;

import java.util.ArrayList;

public class Server implements IServer, ICreateService, IReadService, IUpdateService, IDeleteService {
    // списки выступают в роли хранилища (т.е. "БД")
    private ArrayList<SoundContent> soundContents = new ArrayList<SoundContent>();
    private ArrayList<Artist> artists = new ArrayList<Artist>();
    private ArrayList<Playlist> playlists = new ArrayList<Playlist>();

    //Заполняем хранилище фейковыми данными
    Server() {
        init();
    }

    // функция генерации фейковых данных
    void init() {
        // создаем артистов и их треки
        for (int i = 0; i < 10; i++) {
            int artistId = genArtistId();
            Artist artist = new Artist(artistId, "Artist: " + i);
            for (int j = 0; j < 10; j++) {
                int soundContentId = genSoundContentId();
                SoundContent soundContent = new SoundContent(soundContentId, artist, "1:23", "soundContent " + j + " by " + artist.getName());
                soundContents.add(soundContent);
            }
            artists.add(artist);
        }

        // создаем плейлисты
        for(Artist artist: artists){
            for (int i = 0; i < 10; i++) {
                int albomId = genPlaylistId();
                int playlistId = genPlaylistId();
                Albom albom = new Albom(albomId, "albom " + i, "1997 " + i, "Rock " + i, artist);
                Playlist playlist = new Playlist(playlistId, this.soundContents, albom);
                playlists.add(playlist);
            }
        }
    }

    // наивные генераторы id для сущностей
    int genSoundContentId() {
        int id = soundContents.size() + 1;
        return id;
    }

    ;

    int genPlaylistId() {
        int id = playlists.size() + 1;
        return id;
    }

    ;

    int genArtistId() {
        int id = artists.size() + 1;
        return id;
    }

    ;

    @Override
    public User getUser() {
        return new User("User1");
    }

    @Override
    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    @Override
    public ArrayList<Artist> getArtists() {
        return artists;
    }

    @Override
    public ArrayList<SoundContent> getSoundContents() {
        return soundContents;
    }

    /*
        Create
     */
    @Override
    public SoundContent createSoundContent(Artist artist, String time, String name) {
        // создаем soundContent
        int id = soundContents.size() + 1;
        SoundContent soundContent = new SoundContent(id, artist, time, name);

        // "сохраняем" его на сервере
        soundContents.add(soundContent);

        // возвращаем созданный экземпляр
        return soundContent;
    }

    @Override
    public Playlist createPlaylist(ArrayList<SoundContent> soundContents, Albom albom) {
        int id = playlists.size() + 1;
        Playlist playlist = new Playlist(id, soundContents, albom);

        // "сохраняем" его на сервере
        playlists.add(playlist);

        // возвращаем созданный экземпляр
        return playlist;
    }

    @Override
    public Artist createArtist(String name) {
        int id = artists.size() + 1;
        Artist artist = new Artist(id, name);

        // "сохраняем" его на сервере
        artists.add(artist);

        // возвращаем созданный экземпляр
        return artist;
    }

    /*
       delete
    */
    @Override
    public Boolean deletePlaylistById(int id) {
        return playlists.removeIf(e -> (e.getId() == id));
    }

    @Override
    public Boolean deleteArtisById(int id) {
        return artists.removeIf(e -> (e.getId() == id));
    }

    @Override
    public Boolean deleteAlbomById(int id) {
        return null;
    }

    @Override
    public Boolean deleteSoundContentById(int id) {
        return soundContents.removeIf(e -> (e.getId() == id));
    }

    /*
       Read
    */
    @Override
    public SoundContent getSoundContentById(int id) {
        for (SoundContent soundContent : soundContents) {
            return soundContent.getId() == id ? soundContent : null;
        }
        return null;
    }

    @Override
    public ArrayList<SoundContent> getAllSoundContent() {
        return soundContents;
    }

    @Override
    public Playlist getPlaylistById(int id) {
        for (Playlist playlist : playlists) {
            return playlist.getId() == id ? playlist : null;
        }
        return null;
    }

    @Override
    public Playlist getPlaylistByArtist(Artist artist) {
        for (Playlist playlist : playlists) {
            return playlist.getAlbom().getArtist() == artist ? playlist : null;
        }
        return null;
    }

    @Override
    public Playlist getPlaylistByAlbom(Albom albom) {
        for (Playlist playlist : playlists) {
            return playlist.getAlbom() == albom ? playlist : null;
        }
        return null;
    }

    @Override
    public ArrayList<Playlist> getAllPlaylists() {
        return playlists;
    }

    @Override
    public Artist getArtistByName(String name) {
        for (Artist artist : artists) {
            return artist.getName().equals(name) ? artist : null;
        }
        return null;
    }

    @Override
    public ArrayList<Artist> getAllArtist() {
        return artists;
    }
}
