/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab12;

/**
 *
 * @author P.P RAJU
 */import java.io.*;
import java.util.*;
public class ReadWrite {
    public static void main(String args[]) throws IOException 
    {
        System.out.print("Enter the  a string :\t");
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        try 
        {    
           FileWriter fw=new FileWriter("C:Javalab\\ReaderWriter.txt");    
           fw.write(str);    
           fw.close();    
          }
        catch(Exception e)
        {
            System.out.println(e);
        }    
        System.out.println("File write Successfully..."); 
        FileReader fr = null;
        int ch;
        try
        { 
            fr= new FileReader("C:Javalab\\ReaderWriter.txt"); 
            while ((ch=fr.read())!= -1) 
            {
                System.out.print((char)ch);
            }
             fr.close();
        } 
        catch (Exception fe) 
        { 
            System.out.println("File not found"+fe); 
        } 
        System.out.println();
    }
}
    

