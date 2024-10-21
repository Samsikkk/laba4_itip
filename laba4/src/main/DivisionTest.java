package main;

import exception.CustomDivisionException;
import handler.ExceptionHandler;

public class DivisionTest {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (CustomDivisionException e) {
            ExceptionHandler.logException(e);
        }
    }

    private static void divide(int a, int b) throws CustomDivisionException {
        if (b == 0) {
            throw new CustomDivisionException("Деление на ноль недопустимо.");
        }
        System.out.println("Результат: " + (a / b));
    }
}
