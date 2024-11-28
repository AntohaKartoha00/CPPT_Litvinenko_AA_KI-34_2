package KI304.Litvinenko.Lab3;

import KI304.Litvinenko.Lab2.AudioTrack;
import KI304.Litvinenko.Lab2.DisplaySettings;
import KI304.Litvinenko.Lab2.VideoFile;
import java.util.Scanner;

public class VideoPlayerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Створюємо об'єкт плеєра
        VideoPlayerExtended player = new VideoPlayerExtended();

        // Введення відеофайлу
        System.out.println("Введіть назву відеофайлу:");
        String videoFileName = scanner.nextLine();
        System.out.println("Введіть тривалість відео (в секундах):");
        int videoDuration = scanner.nextInt();
        scanner.nextLine(); // очищуємо буфер

        VideoFile videoFile = new VideoFile(videoFileName, videoDuration);
        player.setVideoFile(videoFile);

        // Введення аудіодоріжки
        System.out.println("Введіть тип аудіодоріжки:");
        String audioType = scanner.nextLine();
        System.out.println("Введіть рівень гучності (0-100):");
        int audioVolume = scanner.nextInt();
        scanner.nextLine(); // очищуємо буфер

        AudioTrack audioTrack = new AudioTrack(audioType, audioVolume);
        player.setAudioTrack(audioTrack);

        // Введення налаштувань дисплея
        System.out.println("Введіть роздільну здатність дисплея:");
        int displayResolution = scanner.nextInt();
        System.out.println("Введіть яскравість дисплея (0-100):");
        int displayBrightness = scanner.nextInt();
        scanner.nextLine(); // очищуємо буфер

        DisplaySettings displaySettings = new DisplaySettings(displayResolution, displayBrightness);
        player.setDisplaySettings(displaySettings);

        // Відтворення відео та виведення інформації
        player.play();
        player.displayInfo();

        // Закриття плеєра
        player.close();
        scanner.close();
    }
}
