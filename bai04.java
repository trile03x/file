
import java.io.File;
import java.util.Scanner;


public class bai04 {
    public static void main(String [] args)
    {
        try{
        File file = new File("bai04.txt");
        Scanner sc = new Scanner(file);
        int n = sc.nextInt();
        int sum=0;
        int dem=0;
        while(sc.hasNextInt())
        {
            sum+=n;
            n=sc.nextInt();
            dem++;
        }
            System.out.println((double)sum/dem);
        }catch(Exception e)
        {
            System.out.println("Error");
        }
    }
}
