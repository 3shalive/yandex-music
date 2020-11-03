package interfaces;

import classes.SoundContent;

public interface IPlayer {
    void play();

    void stop();

    SoundContent next();

    SoundContent prev();

    void upVolume();

    void downVolume();

    void setSoundContent(SoundContent soundContent);

    void deleteSoundContent(SoundContent soundContent);
}
