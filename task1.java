import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить
    // поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации
    // и выведет
    // ноутбуки, отвечающие фильтру.
    // Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение,
    // Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие
    // по условиям.
    public static void main(String[] args) {

        Notebook n1 = new Notebook("Dell");
        Notebook n2 = new Notebook("HP");
        Notebook n3 = new Notebook("MSI");
        Notebook n4 = new Notebook("INTEL");
        Notebook n5 = new Notebook("HP");
        Notebook n6 = new Notebook("HP");
        Notebook n7 = new Notebook("HP");
        Notebook n8 = new Notebook("Samsung");
        List<Notebook> notebooks = initListNotebooks(n1, n2, n3, n4, n5, n6, n7, n8);
        System.out.println(notebooks);

        Map<String, String> params = new TreeMap<>();
        params.put("Name", "HP");
        params.put("CPU", "AMD");
        System.out.println(filter(params, notebooks));

    }

    public static List<Notebook> initListNotebooks(Notebook instance1, Notebook instance2, Notebook instance3,
            Notebook instance4, Notebook instance5, Notebook instance6,
            Notebook instance7, Notebook instance8) {
        List<Notebook> listNotebooks = new ArrayList<>();
        listNotebooks.add(instance1);
        listNotebooks.add(instance2);
        listNotebooks.add(instance3);
        listNotebooks.add(instance4);
        listNotebooks.add(instance5);
        listNotebooks.add(instance6);
        listNotebooks.add(instance7);
        listNotebooks.add(instance8);
        return listNotebooks;
    }

    public static List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) {
        List<Notebook> notebooksSort = new ArrayList<>();
        for (Notebook item : notebooks) {
            for (String key : params.keySet()) {
                if (item.toString().contains(params.get(key)))
                    notebooksSort.add(item);
            }
        }
        return notebooksSort;
    }
}