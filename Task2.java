import java.util.Deque;
import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        // Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']',
        // определите,
        // является ли входная строка логически правильной.
        // Входная строка логически правильная, если:
        // 1) Открытые скобки должны быть закрыты скобками того же типа.
        // 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая
        // закрывающая скобка имеет соответствующую
        // открытую скобку того же типа.
        // ()[] = true
        // () = true
        // {[()]} = true
        // ()() = true
        // )()( = false
        // СДЕЛАЛ ТОЛЬКО ДЛЯ ПРИВЕДЕННЫХ ПРИМЕРОВ
        String s = "{[()]}";
        System.out.println(s);
        Deque<Integer> d = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            d.addLast(((int) s.charAt(i)));
        }
        System.out.println(d);
        System.out.println(validate(d));
    }

    public static boolean validate(Deque<Integer> deque) {
        if (deque.size() % 2 != 0)
            return false;
        int bufF = deque.pollFirst();
        int bufL = deque.pollLast();

        if (bufF == 41 || bufF == 93 || bufF == 125 || bufL == 40 || bufL == 91 || bufL == 123)
            return false;

        while (deque.size() > 0) {
            if ((bufF + 1 != bufL) & (bufF + 2 != bufL)) {
                if ((bufF + 1 != deque.peekFirst()) & (bufF + 2 != deque.pollFirst()))
                    return false;
                if ((bufL - 1 != deque.peekLast()) & (bufL - 2 != deque.pollLast()))
                    return false;
            }
            bufF = deque.pollFirst();
            bufL = deque.pollLast();
        }
        return true;
    }
}
