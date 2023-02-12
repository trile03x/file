
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ACER
 */
public class bai05 {

    public static void main(String[] args) {
        try {
            File file = new File("bai05.txt");
            Scanner sc = new Scanner(file);
            String line = sc.nextLine();
            while(line!=null)
            {
                System.out.println(line+"\n");
                line=sc.nextLine();
            }

        } catch (Exception e) {

        }
    }
}
