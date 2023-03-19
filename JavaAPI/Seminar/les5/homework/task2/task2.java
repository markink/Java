//Пусть дан список сотрудников:
//        Иван Иванов
//        Светлана Петрова
//        Кристина Белова
//        Анна Мусина
//        Анна Крутова
//        Иван Юрин
//        Петр Лыков
//        Павел Чернов
//        Петр Чернышов
//        Мария Федорова
//        Марина Светлова
//        Мария Савина
//        Мария Рыкова
//        Марина Лугова
//        Анна Владимирова
//        Иван Мечников
//        Петр Петин
//        Иван Ежов
//
//        Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//        Отсортировать по убыванию популярности Имени.

package les5.homework.task2;

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        String[] names = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};

        ArrayList<String> arrayList = new ArrayList<String>();

        for (String elem: names) {
            String[] temp = elem.split(" ");
            arrayList.add(temp[0]);
        }

        System.out.println(arrayList);

        Map <String, Integer> map = new HashMap<>();
        for (String elem: arrayList){
            if (!map.containsKey(elem)) {
                map.put(elem, 1);
            } else {
                map.put(elem, Collections.frequency(arrayList, elem));
            }

        }
        map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);



    }
}
