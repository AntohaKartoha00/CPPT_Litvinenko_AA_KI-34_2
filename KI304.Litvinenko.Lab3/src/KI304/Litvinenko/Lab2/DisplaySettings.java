package KI304.Litvinenko.Lab2;

public class DisplaySettings {
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
