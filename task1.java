import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task1 {

    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
    // человек может иметь несколько телефонов.
    // Пусть дан список сотрудников:Иван Иванов (и остальные)
    // Написать программу, которая найдет и выведет повторяющиеся имена с
    // количеством повторений.
    // Отсортировать по убыванию популярности.
    // Иван Иванов 88001122333
    // Иван Курицин 88001662333
    // Иван Курицин 88001112333
    // Иван Незлобин 88001122432
    // Сергей Потапов 88001112453
    // Сергей Потапов 8800163214
    // Сергей Курицин 8800142421
    // Михаил Незлобин 880012343
    // OutPut
    // Иван - 3
    // Сергей - 2
    // Потому как если один сотрудник имеет 2 или более номера , его имя считаем 1
    // раз.

    public static void main(String[] args) {
        Map<String, String> hMap = new HashMap<>();
        {
            hMap.put("88001122333", "Иван Иванов");
            hMap.put("88001662333", "Иван Курицин");
            hMap.put("88001112333", "Иван Курицин");
            hMap.put("88001122432", "Иван Незлобин");
            hMap.put("88001112453", "Сергей Потапов");
            hMap.put("8800163214", "Сергей Потапов");
            hMap.put("8800142421", "Сергей Курицин");
            hMap.put("880012343", "Михаил Незлобин");
        }
        System.out.println(findSortedRepeat(hMap));
    }

    public static Map<Integer, String> findSortedRepeat(Map<String, String> hM) {
        Map<String, Integer> bufHM = new HashMap<>();
        Map<String, Integer> newMap = new HashMap<>();
        for (String i : hM.values()) {
            bufHM.put(i, bufHM.get(i) == null ? 1 : bufHM.get(i) + 1);
        }
        for (String i : bufHM.keySet())
            newMap.put(i.split(" ")[0], newMap.get(i.split(" ")[0]) == null ? 1 : newMap.get(i.split(" ")[0]) + 1);
        Map<Integer, String> res = new TreeMap<>(Collections.reverseOrder());
        for (String i : newMap.keySet()) {
            if (newMap.get(i) > 1)
                res.put(newMap.get(i), i);
        }
        return res;
    }
}