package classes;

import interfaces.ISharable;

import java.util.ArrayList;

public class Playlist implements ISharable {
    ArrayList<SoundContent> soundContents;
    Boolean isPrivate;
    Albom albom;

    public Playlist(ArrayList<SoundContent> soundContents, Albom albom) {
        this.soundContents = soundContents;
        this.albom = albom;
    }

    @Override
    public String share() {
        return "Ваш код трека: 231d91ye1289ye2189";
    }

    void addSoundContent(SoundContent soundContent){
        soundContents.add(soundContent);
    };

    public void setSoundContents(ArrayList<SoundContent> soundContents) {
        this.soundContents = soundContents;
    }

    public Albom getAlbom() {
        return albom;
    }

    public Boolean getPrivate() {
        return isPrivate;
    }

    public ArrayList<SoundContent> getSoundContents() {
        return soundContents;
    }
}
