package main;

import exception.CustomNumberFormatException;
import handler.ExceptionHandler;

public class NumberFormatTest {
    public static void main(String[] args) {
        try {
            parseInteger("abc");
        } catch (CustomNumberFormatException e) {
            ExceptionHandler.logException(e);
        }
    }

    private static void parseInteger(String input) throws CustomNumberFormatException {
        try {
            int number = Integer.parseInt(input);
            System.out.println("Число: " + number);
        } catch (NumberFormatException e) {
            throw new CustomNumberFormatException("Недопустимый формат числа: " + input);
        }
    }
}
