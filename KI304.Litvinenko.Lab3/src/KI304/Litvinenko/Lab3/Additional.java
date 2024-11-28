package KI304.Litvinenko.Lab3;

class VideoFile {
    private String fileName;
    private int duration; // Тривалість у секундах

    public VideoFile(String fileName, int duration) {
        this.fileName = fileName;
        this.duration = duration;
    }

    public String getFileName() {
        return fileName;
    }

    public int getDuration() {
        return duration;
    }
}

class AudioTrack {
    private String type;
    private int volume;

    public AudioTrack(String type, int volume) {
        this.type = type;
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

class DisplaySettings {
    private int resolution;
    private int brightness;

    public DisplaySettings(int resolution, int brightness) {
        this.resolution = resolution;
        this.brightness = brightness;
    }

    public int getResolution() {
        return resolution;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
