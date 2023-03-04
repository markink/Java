package JavaAPI.Lection.les1.task2;

import java.io.FileWriter;
import java.io.IOException;

public class program {
    public static void main(String[] args) throws Exception {
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
