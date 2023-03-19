package les5.homework.task3;

public class task3 {

    public static String [][] createTable (){
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = "0";
            }
        }
        return array;
    }

    public static String [][] createQueen (String [][] array){
        array[0][0] = "x";
        int queen = 7;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (queen > 0) {
                    //Проверка +
                    boolean checkX = true;
                    for (int k = 0; k < array.length; k++) {
                        if (checkX == true) {
                            if (array[i][k].equals("x")) {
                                checkX = false;
                            }
                            if (array[k][j].equals("x")) {
                                checkX = false;
                            }
                        }
                    }

                    //Проверка х

                    for (int k = 0; k < array.length; k++) {
                        if (checkX == true) {
                            if (i-k >= 0 & j-k >=0) {
                                if (array[i-k][j-k].equals("x")) {
                                    checkX = false;
                                }
                            }
                            for (int l = 0; l < array.length; l++) {
                                if (i+l < 8 & j+l < 8){
                                    if (array[i+l][j+l].equals("x")){
                                        checkX = false;
                                    }
                                }
                            }
                        }
                    }

                    if (checkX == true) {
                        array[i][j] = "x";
                        queen--;
                    }
                }
            }
        }
        return array;
    }

    public static void printArray (String [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        String [][] array = createTable();
        printArray(array);
        createQueen(array);
        System.out.println("После создания ферзей");
        printArray(array);
    }
}
