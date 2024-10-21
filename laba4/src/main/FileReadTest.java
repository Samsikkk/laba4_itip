package main;

import exception.CustomFileNotFoundException;
import handler.ExceptionHandler;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class FileReadTest {
    public static void main(String[] args) {
        try {
            readFile("nonexistent.txt");
        } catch (CustomFileNotFoundException e) {
            ExceptionHandler.logException(e);
        }
    }

    private static void readFile(String fileName) throws CustomFileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new CustomFileNotFoundException("Файл не найден: " + fileName);
        }

        // Чтение файла (если он существует)
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new CustomFileNotFoundException("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
