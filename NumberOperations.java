public class NumberOperations {
      public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

     public static void checkNumberSign(int num) {
        if (num >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

     public static boolean isNegative(int num) {
        return num < 0;
    }
}
