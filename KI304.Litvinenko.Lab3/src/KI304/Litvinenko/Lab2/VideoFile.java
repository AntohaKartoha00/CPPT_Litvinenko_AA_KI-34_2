package KI304.Litvinenko.Lab2;

public class VideoFile {
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
