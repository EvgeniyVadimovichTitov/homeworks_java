// Task1
// Заполните массив случайным числами и выведите максимальное, 
// минимальное и среднее значение.

// Для генерации случайного числа используйте метод Math.random(), 
// который возвращает значение в промежутке [0, 300].

public class task1 {
    public static void main(String[] args) {

        int n = 100;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 301);
        }

        int max = array[0];
        int min = array[0];
        double avg = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            avg += array[i] / array.length;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}