package main;

import exception.CustomAgeException;
import handler.ExceptionHandler;

public class AgeTest {
    public static void main(String[] args) {
        try {
            checkAge(150);
        } catch (CustomAgeException e) {
            ExceptionHandler.logException(e);
        }
    }

    private static void checkAge(int age) throws CustomAgeException {
        if (age < 0 || age > 120) {
            throw new CustomAgeException("Недопустимый возраст: " + age);
        }
        System.out.println("Возраст: " + age);
    }
}

