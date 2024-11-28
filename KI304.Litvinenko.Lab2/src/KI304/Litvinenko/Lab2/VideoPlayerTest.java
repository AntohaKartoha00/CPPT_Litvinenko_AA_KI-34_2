package KI304.Litvinenko.Lab2;

import java.util.Scanner;

public class VideoPlayerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Створюємо об'єкт плеєра
        VideoPlayer player = new VideoPlayer();

        // Виконуємо стандартні дії з плеєром
        System.out.println("Відтворення відео...");
        player.play();

        // Пауза
        System.out.println("Натисніть Enter, щоб поставити відео на паузу.");
        scanner.nextLine();
        player.pause();

        // Зміна відеофайлу
        System.out.println("Введіть новий файл відео (наприклад: new_movie.mp4):");
        String newVideoFile = scanner.nextLine();
        System.out.println("Введіть тривалість відео (в секундах):");
        int newVideoDuration = scanner.nextInt();
        scanner.nextLine(); // очищуємо буфер після введення числа

        VideoFile newVideo = new VideoFile(newVideoFile, newVideoDuration);
        player.setVideoFile(newVideo);

        // Зміна аудіодоріжки
        System.out.println("Введіть тип аудіодоріжки (наприклад: Dolby Surround):");
        String newAudioType = scanner.nextLine();
        System.out.println("Введіть рівень гучності (0-100):");
        int newVolume = scanner.nextInt();
        scanner.nextLine(); // очищуємо буфер після введення числа

        AudioTrack newAudioTrack = new AudioTrack(newAudioType, newVolume);
        player.setAudioTrack(newAudioTrack);

        // Зміна налаштувань дисплея
        System.out.println("Введіть роздільну здатність дисплея (наприклад: 1080):");
        int newResolution = scanner.nextInt();
        System.out.println("Введіть яскравість дисплея (0-100):");
        int newBrightness = scanner.nextInt();
        scanner.nextLine(); // очищуємо буфер після введення числа

        DisplaySettings newDisplaySettings = new DisplaySettings(newResolution, newBrightness);
        player.setDisplaySettings(newDisplaySettings);

        // Показуємо зміни
        System.out.println("Відео змінено на: " + player.getVideoFile().getFileName() + " тривалість: " + player.getVideoFile().getDuration() + " секунд");
        System.out.println("Аудіодоріжка змінена на: " + player.getAudioTrack().getType() + " з гучністю: " + player.getAudioTrack().getVolume());
        System.out.println("Налаштування дисплея змінені на роздільну здатність: " + player.getDisplaySettings().getResolution() + " і яскравість: " + player.getDisplaySettings().getBrightness());

        // Зупинка плеєра
        System.out.println("Натисніть Enter, щоб зупинити відео.");
        scanner.nextLine();
        player.stop();

        // Закриття плеєра
        player.close();
        scanner.close();
    }
}
 