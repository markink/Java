//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
//        NoteBook notebook1 = new NoteBook
//        NoteBook notebook2 = new NoteBook
//        NoteBook notebook3 = new NoteBook
//        NoteBook notebook4 = new NoteBook
//        NoteBook notebook5 = new NoteBook
//Например: “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//Класс сделать в отдельном файле
//приветствие
//Выбор параметра
//выбор конкретнее
//вывод подходящих

package les6.homework.task1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task1 {

    public static int intPrompt(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public static void main(String[] args) {

        Notebook notebook1 = new Notebook("Lenovo", 32, "Ubuntu", 70000, "Red", 128);
        Notebook notebook2 = new Notebook("Acer 3", 16, "Debian", 85000, "Green", 128);
        Notebook notebook3 = new Notebook("Asus", 16, "Windows11", 65000, "Blue", 256);
        Notebook notebook4 = new Notebook("HP", 12, "Windows10", 90000, "Yellow", 512);
        System.out.println(notebook1);
        System.out.println(notebook2);
        System.out.println(notebook3);
        System.out.println(notebook4);

        while (true) {
            int value = intPrompt("Введите число соотвествующее критерию \n0 чтобы выйти \n1 - ОЗУ\n" +
                    "2 - Объем ЖД\n" +
                    "3 - Операционная система\n" +
                    "4 - Цвет");
            if (value == 1) {
                System.out.println("Память у ноутбука " + notebook1.getName() + " равна " + notebook1.getAmountRAM());
                System.out.println("Память у ноутбука " + notebook2.getName() + " равна " + notebook2.getAmountRAM());
                System.out.println("Память у ноутбука " + notebook3.getName() + " равна " + notebook3.getAmountRAM());
                System.out.println("Память у ноутбука " + notebook4.getName() + " равна " + notebook4.getAmountRAM());
            } else if (value == 2) {
                System.out.println("Объём ЖД у ноутбука" + notebook1.getName() + " равна " + notebook1.getHardRAM());
                System.out.println("Объём ЖД у ноутбука" + notebook2.getName() + " равна " + notebook2.getHardRAM());
                System.out.println("Объём ЖД у ноутбука" + notebook3.getName() + " равна " + notebook3.getHardRAM());
                System.out.println("Объём ЖД у ноутбука" + notebook4.getName() + " равна " + notebook4.getHardRAM());
            } else if (value == 3) {
                System.out.println("Операционная сиситема на ноутбуке " + notebook1.getName() + " это " + notebook1.getOperatingSystem());
                System.out.println("Операционная сиситема на ноутбуке " + notebook2.getName() + " это " + notebook2.getOperatingSystem());
                System.out.println("Операционная сиситема на ноутбуке " + notebook3.getName() + " это " + notebook3.getOperatingSystem());
                System.out.println("Операционная сиситема на ноутбуке " + notebook4.getName() + " это " + notebook4.getOperatingSystem());
            } else if (value == 4) {
                System.out.println("Цвет на ноутбуке  " + notebook1.getName() + " это " + notebook1.getColor());
                System.out.println("Цвет на ноутбуке  " + notebook2.getName() + " это " + notebook2.getColor());
                System.out.println("Цвет на ноутбуке  " + notebook3.getName() + " это " + notebook3.getColor());
                System.out.println("Цвет на ноутбуке  " + notebook4.getName() + " это " + notebook4.getColor());
            } else if (value == 0) {
                break;
            } else {
                System.out.println("Incorrect");
            }
        }
    }
}
