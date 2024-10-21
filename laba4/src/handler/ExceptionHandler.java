package handler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHandler {
    private static final String LOG_FILE = "exceptions.log";

    public static void logException(Exception e) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            writer.write(e.getClass().getName() + ": " + e.getMessage());
            writer.newLine();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
