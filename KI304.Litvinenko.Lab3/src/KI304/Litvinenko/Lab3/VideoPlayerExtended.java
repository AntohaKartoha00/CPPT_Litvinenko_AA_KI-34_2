package KI304.Litvinenko.Lab3;

import KI304.Litvinenko.Lab2.AudioTrack;
import KI304.Litvinenko.Lab2.DisplaySettings;
import KI304.Litvinenko.Lab2.VideoFile;
import KI304.Litvinenko.Lab2.VideoPlayer;

public class VideoPlayerExtended extends VideoPlayer implements Playable {

    @Override
    public void play() {
        System.out.println("Відео відтворюється: " + getVideoFile().getFileName());
    }

    @Override
    public void displayInfo() {
        System.out.println("Відеофайл: " + getVideoFile().getFileName() +
                ", Тривалість: " + getVideoFile().getDuration() + " секунд");
        System.out.println("Аудіодоріжка: " + getAudioTrack().getType() +
                ", Гучність: " + getAudioTrack().getVolume());
        System.out.println("Роздільна здатність: " + getDisplaySettings().getResolution() +
                ", Яскравість: " + getDisplaySettings().getBrightness());
    }
}
