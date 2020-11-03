package classes;

import interfaces.IPlayer;

import java.util.ArrayList;

public class Player implements IPlayer {
    ArrayList<SoundContent> soundContents;
    SoundContent currentSoundContent;

    Player(){
        soundContents = new ArrayList<SoundContent>();
    }

    @Override
    public void play() {
        try{
            System.out.println("Запускаю трек: "+ currentSoundContent);

        }catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException.getMessage());
        }
    }

    @Override
    public void stop() {

    }

    @Override
    public SoundContent next() {
        return null;
    }

    @Override
    public SoundContent prev() {
        return null;
    }

    @Override
    public void upVolume() {

    }

    @Override
    public void downVolume() {

    }

    @Override
    public void setSoundContent(SoundContent soundContent) {

    }

    @Override
    public void deleteSoundContent(SoundContent soundContent) {

    }
}
