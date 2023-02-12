
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ACER
 */
public class bai06 {

    public static void main(String[] args) {
        try {
            File f = new File("bai06.txt");
            Scanner sc = new Scanner(f);
            int count = sc.nextInt();
            System.out.println(count);
            FileWriter f2 = new FileWriter("bai06.txt");
            BufferedWriter w = new BufferedWriter(f2);
            count+=1;
            String s = String.valueOf(count);
            w.write(s);
            w.close();
        } catch (Exception e) {
            System.out.println("rr");
        }

    }
}
