import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(69, 2, 3, 4, 10, 12, 1, 56, 77));
        System.out.println(arr);
        List<Integer> new_arr = removeEvenValue(arr);
        System.out.println(new_arr);
        System.out.println("min: " + getMin(arr));
        System.out.println("max: " + getMax(arr));
        System.out.println("agv: " + getAverage(arr));

    }

    // Нужно удалить из него четные числа
    public static List<Integer> removeEvenValue(List<Integer> list) {
        List<Integer> tmp = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0)
                continue;
            tmp.remove(list.get(i));
        }
        return new ArrayList<>(tmp);
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list) {
        int min = list.get(0);
        for (Integer item : list) {
            if (min > item)
                min = item;
        }
        return min;
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list) {
        int max = list.get(0);
        for (Integer item : list) {
            if (max < item)
                max = item;
        }
        return max;
    }

    // Найти среднее значение
    public static Integer getAverage(List<Integer> list) {
        int agv = 0;
        for (Integer i : list)
            agv += i;
        return agv / list.size();
    }
}