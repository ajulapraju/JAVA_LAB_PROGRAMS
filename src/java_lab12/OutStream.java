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
public class OutStream {
    public static void main(String args[])
    {
        try
        {    
             FileOutputStream f=new FileOutputStream("C:Javalab\\Write.txt");    
             String s="Welcome";    
             byte b[]=s.getBytes(); 
             f.write(b);    
             f.close();    
             System.out.println("File Created And Write Successfully");    
        }
        catch(Exception e)
            {
                System.out.println(e);
            }    
            
    }

}
    

