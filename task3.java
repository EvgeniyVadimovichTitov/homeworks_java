// Task3
// Напишите программу, которая выводит на консоль простые числа 
// в промежутке от [2, 100]. Используйте для решения этой задачи 
// оператор "%" (остаток от деления) и циклы.

public class task3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            double squareRoot = Math.sqrt(i) + 2;
            int j = 2;
            while (j <= squareRoot && isPrime) {
                if (i == 2 || i == 3)
                    break;
                if (i % j == 0)
                    isPrime = false;
                j++;
            }
            System.out.print(isPrime ? (i + " ") : "");
        }
    }

}
