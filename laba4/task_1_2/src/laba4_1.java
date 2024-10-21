public class laba4_1 {
    public static void main(String[] args) {
        Object[] arr = {1};
        double sum = 0;
        int count = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] instanceof Number) {
                    sum += ((Number) arr[i]).doubleValue();
                    count++;
                } else {
                    throw new IllegalArgumentException(arr[i] + " Не является числом: ");
                }
            }
            if (count == 0) {
                throw new ArithmeticException("Нет числовых элементов для вычисления среднего арифметического.");
            }

            double average = sum / count;
            System.out.println("Среднее арифметическое: " + average);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за границы массива.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Завершение обработки массива.");
        }
    }
}
