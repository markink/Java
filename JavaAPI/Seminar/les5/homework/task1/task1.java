//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
//        Добавить функции 1) Добавление номера
//        2) Вывод всего
//        Пример:
//        Я ввожу: 1
//        К: Введите фамилию
//        Я: Иванов
//        К: Введите номер
//        Я: 1242353
//        К: Введите 1) Добавление номера
//        2) Вывод всего
//        Я ввожу: 1
//        К: Введите фамилию
//        Я: Иванов
//        К: Введите номер
//        Я: 547568
//        К: Введите 1) Добавление номера
//        2) Вывод всего
//        Я: 2
//        Иванов: 1242353, 547568


package les5.homework.task1;

import java.util.*;

public class task1 {

    public static int intPrompt(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String stringPrompt(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static Map<String, LinkedList<Integer>> createGuide (int value, String surname, int number, Map<String, LinkedList<Integer>> map) {
        if (value == 1) {
            if (map.containsKey(surname)){
                LinkedList <Integer> value2 = map.get(surname);
                LinkedList<Integer> value1 = new LinkedList<>(value2);
                value1.add(number);
                map.put(surname, value1);
                return createGuide(intPrompt("1) Добавление номера\n2) Вывод всего"), stringPrompt("Введите фамилию "), intPrompt("Введите номер"), map);

            } else {
                LinkedList<Integer> ll = new LinkedList<>();
                ll.add(number);
                map.put(surname, ll);
                return createGuide(intPrompt("1) Добавление номера\n2) Вывод всего"), stringPrompt("Введите фамилию "), intPrompt("Введите номер"), map);
            }

        } else if (value == 2) {
            return map;
        } else {
            System.out.println("Incorrect value");
            return createGuide(intPrompt("1) Добавление номера\n2) Вывод всего"), stringPrompt("Введите фамилию "), intPrompt("Введите номер"), map);
        }
    }

    public static void main(String[] args) {
        Map <String, LinkedList<Integer>> map = new HashMap<>();
        System.out.println(createGuide(1, stringPrompt("Введите фамилию "), intPrompt("Введите номер"), map).entrySet());
    }
}
