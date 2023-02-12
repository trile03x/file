
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class bai01 {

    public static void main(String[] args) throws IOException {
        try {
            FileReader file = new FileReader("bai01.txt");
            BufferedReader reader = new BufferedReader(file);
            FileWriter filecp = new FileWriter("bai01cp.txt");
            BufferedWriter writer = new BufferedWriter(filecp);
            String line = reader.readLine();
            int stt =1;
            while (line != null) {
                System.out.println(line);
                writer.write("Line "+stt+":"+line+"\n");
                line = reader.readLine();
                stt++;
            }
            writer.close();
        } catch (Exception e) {
        }

    }
}
