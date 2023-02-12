/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;

public class bai08 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader file=new FileReader("bai08.txt"); 
        BufferedReader f=new BufferedReader(file);
        String str=f.readLine();
        int []count=new int[100];
        while(str!=null){
            for(int i=0;i<str.length();i++){
                str=str.replaceAll("\\s++","");
                System.out.println(str.charAt(i));
            count[str.charAt(i)-'A']++;
        }
            str=f.readLine();
        }
        
        for(int i=0;i<100;i++){
            if(count[i]!=0){
                System.out.println((char)(i +'A') + ": " + count[i]);
            }
        }
    }
}