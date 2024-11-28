package KI304.Litvinenko.Lab3;

import java.util.Scanner;

public class VideoPlayerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Створюємо об'єкт відеомагнітофона
        VCR vcr = new VCR();

        // Виконуємо стандартні дії
        vcr.play();

        System.out.println("Натисніть Enter, щоб поставити відео на паузу.");
        scanner.nextLine();
        vcr.pause();

        // Перемотка відео
        System.out.println("Натисніть Enter, щоб перемотати відео.");
        scanner.nextLine();
        vcr.rewind();

        System.out.println("Натисніть Enter, щоб зупинити відео.");
        scanner.nextLine();
        vcr.stop();

        vcr.close();
        scanner.close();
    }
}
