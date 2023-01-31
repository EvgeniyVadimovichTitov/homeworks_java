import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task1 {

    // Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся
    // в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    // Сложите два числа и верните сумму в виде связанного списка.
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 9, 7));
        Deque<Integer> sumD1D2 = sum(d1, d2);
        System.out.println(sumD1D2);

    }

    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        String sum = Integer.toString(DequeParsetoInt(d1) + DequeParsetoInt(d2));// если создать такой же метод но с
                                                                                 // умножением позволит решить задание
                                                                                 // Homework
        Deque<Integer> d3 = new ArrayDeque<>();
        for (int i = sum.length() - 1; i >= 0; i--) {
            d3.addLast(Character.digit(sum.charAt(i), 10));
        }
        return d3;
    }

    public static int DequeParsetoInt(Deque<Integer> d) {
        // будет работать с отрицательными числами в том числе
        String buffD = "";
        while (d.peekLast() != null) {
            buffD += Integer.toString(d.pollLast());
        }
        return Integer.parseInt(buffD);
    }
}