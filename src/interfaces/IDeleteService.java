package interfaces;

public interface IDeleteService {
    Boolean deletePlaylistById(int id);
    Boolean deleteArtisById(int id);
    Boolean deleteAlbomById(int id);
    Boolean deleteSoundContentById(int id);
}
