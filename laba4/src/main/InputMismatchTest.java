package main;

import exception.CustomInputMismatchException;
import handler.ExceptionHandler;

import java.util.Scanner;

public class InputMismatchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите целое число: ");
            int number = scanner.nextInt();
            System.out.println("Вы ввели число: " + number);
        } catch (java.util.InputMismatchException e) {
            ExceptionHandler.logException(new CustomInputMismatchException("Ввод не является целым числом."));
        } finally {
            scanner.close();
        }
    }
}
