
//Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
//        Ввод:5
//        Треугольное число 1 + 2 + 3 + 4 + 5 = 15
//        n! 1 * 2 * 3 * 4 * 5 = 120
//

package JavaAPI.Seminar.les1.homework.task1;

import java.util.Scanner;

public class recurison {
    public static int recursionSum(int value, int sum){
        if (value > 0) {
            sum = sum + value;
            return recurison.recursionSum(value - 1, sum);
        } else {
            return sum;
        }

    }
    public static int recursionMultiply(int value, int multiply){
        if (value > 0) {
            multiply = multiply*value;
            return recurison.recursionMultiply(value - 1, multiply);
        } else {
            return multiply;
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value1 = scanner.nextInt();

        System.out.printf("Треугольное число %d \n", recurison.recursionSum(value1, 0));
        System.out.printf("n! %d", recurison.recursionMultiply(value1, 1));
    }
}