import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("1. Проверка суммы 5 и 10: " + NumberOperations.checkSumInRange(5, 10));

        System.out.print("2. Проверка числа -5: ");
        NumberOperations.checkNumberSign(-5);

        System.out.println("3. Проверка отрицательное ли число 5: " + NumberOperations.isNegative(5));

        System.out.println("4. Печать строки 3 раза:");
        StringOperations.printStringMultipleTimes("Hello", 3);

        System.out.println("5. Проверка 2020 года на високосность: " + DateOperations.isLeapYear(2020));

        int[] binaryArray = {1, 0, 1, 1, 0};
        System.out.println("6. Исходный массив: " + Arrays.toString(binaryArray));
        ArrayOperations.invertArray(binaryArray);
        System.out.println("   Инвертированный массив: " + Arrays.toString(binaryArray));

        System.out.println("7. Массив 1..100: " + Arrays.toString(ArrayOperations.fillArray1To100()));

        int[] numbers = {1, 5, 3, 2, 6, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("8. Исходный массив: " + Arrays.toString(numbers));
        ArrayOperations.multiplyLessThan6(numbers);
        System.out.println("   Массив после умножения: " + Arrays.toString(numbers));

        int[][] matrix = new int[5][5];
        ArrayOperations.fillDiagonals(matrix);
        System.out.println("9. Матрица с диагоналями:");
        for (int[] row : matrix) {
            System.out.println("   " + Arrays.toString(row));
        }

        System.out.println("10. Массив из 5 элементов со значением 10: " +
                Arrays.toString(ArrayOperations.createFilledArray(5, 10)));
    }
}
