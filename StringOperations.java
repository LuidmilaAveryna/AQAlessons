public class StringOperations {

    public static void printStringMultipleTimes(String str, int count) {
        if (count <= 0) {
            System.out.println("Количество должно быть положительным");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
}
