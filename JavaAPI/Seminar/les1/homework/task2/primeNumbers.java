package JavaAPI.Seminar.les1.homework.task2;

public class primeNumbers {

    public static boolean checkSimple(int i){
        if (i<=1)
            return false;
        else if (i <=3)
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }
    public static void main(String[] args) {

        for (int i = 0; i < 1001; i++) {
            if (primeNumbers.checkSimple(i) == true){
                System.out.println(i);
            }

        }
    }
}
