import java.util.Arrays;

// Task2
// Реализуйте алгоритм сортировки пузырьком для сортировки массива

public class task2 {
    public static void main(String[] args) {

        int n = 21;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 301);
        }

        boolean isSorted = false;
        int buf = 0;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
