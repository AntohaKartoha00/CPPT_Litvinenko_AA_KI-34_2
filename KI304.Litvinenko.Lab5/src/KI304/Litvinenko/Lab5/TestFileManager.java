package KI304.Litvinenko.Lab5;

import KI304.Litvinenko.Lab4.EquationsApp;
import java.util.Scanner;

public class TestFileManager {
    public static void main(String[] args) {
        EquationsApp calculator = new EquationsApp();
        FileManager fileManager = new FileManager();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble(); // Введення x тут, лише один раз

        // Отримання результату або помилки
        String result = calculator.calculate(x);
        String textFilename = "result.txt";
        String binaryFilename = "result.bin";

        // Запис результатів у файли
        fileManager.writeResultToTextFile(textFilename, result);
        fileManager.writeResultToBinaryFile(binaryFilename, result);

        // Читання результатів
        String textResult = fileManager.readResultFromTextFile(textFilename);
        String binaryResult = fileManager.readResultFromBinaryFile(binaryFilename);

        System.out.println("Текстовий файл: " + textResult);
        System.out.println("Двійковий файл: " + binaryResult);

        scanner.close();
    }
}
