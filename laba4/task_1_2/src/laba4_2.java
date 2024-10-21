import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class laba4_2 {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\samsi\\IdeaProjects\\untitled\\out\\production\\task_1_2\\1.txt";
        String destinationFile = "C:\\Users\\samsi\\IdeaProjects\\untitled\\out\\production\\task_1_2\\2.txt";

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(sourceFile);
            outputStream = new FileOutputStream(destinationFile);

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("Копирование завершено успешно.");

        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                System.err.println("Ошибка при закрытии файлов: " + e.getMessage());
            }
        }
    }
}
