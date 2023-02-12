
import java.io.BufferedReader;
import java.io.FileReader;

public class bai07 {

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("bai07.txt");
            BufferedReader sc = new BufferedReader(file);
            int com = 0;
            int gov = 0;
            int edu = 0;
            int org = 0;
            int other=0;
            String line = sc.readLine();
          
            while (line != null) {
                 String [] str = line.split("\\.");
                  if(str[1].equals("com"))
                  {
                      com++;
                  }
                  else if(str[1].equals("gov"))
                  {
                      gov++;
                  }
                  else if(str[1].equals("edu"))
                  {
                      edu++;
                  }
                  else if(str[1].equals("org"))
                  {
                      org++;
                  }
                  else
                  {
                      other++;
                  }
               
                  line = sc.readLine();
            }
            System.out.println("-so luong truong co ten mien .com = "+com);
            System.out.println("-so luong truong co ten mien .gov = "+gov);
            System.out.println("-so luong truong co ten mien .edu = "+edu);
            System.out.println("-so luong truong co ten mien .org = "+org);
            System.out.println("-so luong truong co ten mien khac = "+other);
            

        } catch (Exception e) {
            System.out.println("loi");
        }
    }
}
