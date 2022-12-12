import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;

public class Key {
    // 25 keys in a 2 octave board
    // 10 black 15 white
    // C C# D Eb E F F# G Ab A Bb B x2 (ending on C)
    public String soundPath;
    public MediaPlayer player;
    public Color color;

    // constructor
    public Key(Color color, String soundPath) {
        this.color = color;
        this.soundPath = soundPath;
    }

    public Color getColor() {
        return color;
    }

    public String getSoundPath() {
        return soundPath;
    }

    public MediaPlayer generateMediaPlayer() {
        String URI = new File(getSoundPath()).toURI().toString();
        Media media = new Media(URI);
        MediaPlayer player = new MediaPlayer(media);
        this.player = player;
        return player;
    }

    public void pausePlayer() {
        player.pause();
    }

    public void stopPlayer() {
        player.stop();
    }

    public void startPlayer() {
        player.play();
    }
}
