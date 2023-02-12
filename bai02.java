
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bai02 {

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("bai02.txt");
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();
            String []words = line.split("\\s+");
            for(int i=0;i<words.length;i++)
            {
                System.out.println(words[i]);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
