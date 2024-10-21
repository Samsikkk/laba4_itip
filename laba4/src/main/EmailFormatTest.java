package main;

import exception.CustomEmailFormatException;
import handler.ExceptionHandler;

public class EmailFormatTest {
    public static void main(String[] args) {
        try {
            validateEmail("invalid-email");
        } catch (CustomEmailFormatException e) {
            ExceptionHandler.logException(e);
        }
    }
    private static void validateEmail(String email) throws CustomEmailFormatException {
        if (!email.contains("@") || !email.contains(".")) {
            throw new CustomEmailFormatException("Недопустимый формат email: " + email);
        }
        System.out.println("Email валиден: " + email);
    }
}

