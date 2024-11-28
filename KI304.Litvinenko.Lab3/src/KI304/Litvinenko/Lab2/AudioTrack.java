package KI304.Litvinenko.Lab2;

public class AudioTrack {
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
