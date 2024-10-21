package main;

import exception.CustomUnsupportedOperationException;
import handler.ExceptionHandler;

public class OperationTest {
    public static void main(String[] args) {
        try {
            performOperation(5, 3, "multiply");
            performOperation(5, 3, "unknown");
        } catch (CustomUnsupportedOperationException e) {
            ExceptionHandler.logException(e);
        }
    }

    private static void performOperation(int a, int b, String operation) throws CustomUnsupportedOperationException {
        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Сумма: " + (a + b));
                break;
            case "subtract":
                System.out.println("Разность: " + (a - b));
                break;
            case "multiply":
                System.out.println("Произведение: " + (a * b));
                break;
            case "divide":
                if (b == 0) throw new ArithmeticException("Деление на ноль");
                System.out.println("Частное: " + (a / b));
                break;
            default:
                throw new CustomUnsupportedOperationException("Операция не поддерживается: " + operation);
        }
    }
}
