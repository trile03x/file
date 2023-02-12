
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class bai03 {

    public static void main(String[] args) {
        try {
            File file = new File("bai03.txt");
            Scanner reader = new Scanner(file);
            int stt =1;
            String line = reader.nextLine();
            while (reader.hasNext()) {
             stt++;
              line = reader.nextLine();
            }
            reader.close();
            System.out.println(stt);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
