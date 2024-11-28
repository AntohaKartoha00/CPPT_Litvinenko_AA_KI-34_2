package KI304.Litvinenko.Lab3;

abstract class VideoPlayer {
    private VideoFile videoFile;
    private AudioTrack audioTrack;
    private DisplaySettings displaySettings;

    public abstract void play();
    public abstract void pause();
    public abstract void stop();

    public void close() {
        System.out.println("Відео плеєр закрито.");
    }

    public void setVideoFile(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public VideoFile getVideoFile() {
        return videoFile;
    }

    public void setAudioTrack(AudioTrack audioTrack) {
        this.audioTrack = audioTrack;
    }

    public AudioTrack getAudioTrack() {
        return audioTrack;
    }

    public void setDisplaySettings(DisplaySettings displaySettings) {
        this.displaySettings = displaySettings;
    }

    public DisplaySettings getDisplaySettings() {
        return displaySettings;
    }
}
