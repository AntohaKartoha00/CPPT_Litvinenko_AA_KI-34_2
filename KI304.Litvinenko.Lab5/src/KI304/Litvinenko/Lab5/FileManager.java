package KI304.Litvinenko.Lab5;

import java.io.*;

public class FileManager {

    // Запис 
    public void writeResultToTextFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Помилка при записі у текстовий файл: " + e.getMessage());
        }
    }

    // Читання результату з текстового файлу
    public String readResultFromTextFile(String filename) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Помилка при читанні з текстового файлу: " + e.getMessage());
        }
        return content.toString();
    }

    // Запис результату у двійковий файл
    public void writeResultToBinaryFile(String filename, String content) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeUTF(content); // Записуємо строку
        } catch (IOException e) {
            System.err.println("Помилка при записі у двійковий файл: " + e.getMessage());
        }
    }

    // Читання результату з двійкового файлу
    public String readResultFromBinaryFile(String filename) {
        String content = "";
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            content = dis.readUTF();
        } catch (IOException e) {
            System.err.println("Помилка при читанні з двійкового файлу: " + e.getMessage());
        }
        return content;
    }
}
