package JavaAPI.Seminar.les1.homework.task3;//Реализовать простой калькулятор (+ - / *)
//        Ввод числа ->
//        Ввод знака ->
//        Ввод числа ->
import java.util.Scanner;

public class calculate {
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

    public static String calculateValue(int value1, String sign, int value2) {
        if (sign.equals("+")) {
            System.out.println(value1+value2);
            return calculate.calculateValue(intPrompt("Введите 1 значение"),  stringPrompt("Введите знак (0 если хотите выйти)"), intPrompt("Введите 2 значение"));
        } else if (sign.equals("-")) {
            System.out.println(value1 - value2);
            return calculate.calculateValue(intPrompt("Введите 1 значение"),  stringPrompt("Введите знак (0 если хотите выйти)"), intPrompt("Введите 2 значение"));        } else if (sign == "*") {

        } else if (sign.equals("*")) {
            System.out.println(value1*value2);
            return calculate.calculateValue(intPrompt("Введите 1 значение"),  stringPrompt("Введите знак (0 если хотите выйти)"), intPrompt("Введите 2 значение"));
        } else if (sign.equals("/")) {
            try {
                System.out.println(value1/value2);
            } catch (Exception e){
                System.out.println("Деление на ноль");
                return calculate.calculateValue(intPrompt("Введите 1 значение"),  stringPrompt("Введите знак (0 если хотите выйти)"), intPrompt("Введите 2 значение"));
            }
            return calculate.calculateValue(intPrompt("Введите 1 значение"),  stringPrompt("Введите знак (0 если хотите выйти)"), intPrompt("Введите 2 значение"));
        } else if (sign.equals("0")) {
            return "Конец";

        } else {
            System.out.println("Вы не правильно ввели знак");
            return calculate.calculateValue(intPrompt("Введите 1 значение"),  stringPrompt("Введите знак"), intPrompt("Введите 2 значение"));
        }
        return "Конец";

    }

    public static void main(String[] args) {
        int inputValue1 = calculate.intPrompt("Введите 1 значение");
        String sign = calculate.stringPrompt("Введите знак");
        int inputValue2 = calculate.intPrompt("Введите 2 значение");

        System.out.println(calculate.calculateValue(inputValue1, sign, inputValue2));
    }

}
