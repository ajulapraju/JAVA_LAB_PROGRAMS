/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab11;

/**
 *
 * @author P.P RAJU
 */import java.io.*;
public class FileMethods2 {
    public static void main (String args[]) throws IOException      
    {  
        File f = new File ("c:/Javalab/temp");
        if (f.mkdir()) 
            System.out.println("created a directory"+f);
        else 
            System.out.println ("unable to create a directory"+f);  
    }  
} 
