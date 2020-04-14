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
public class Rename 
{
  public static void main(String args[])
  {       
        File f = new File("c:\\Javalab","java.txt");  
        File f1 = new File("c:\\Javalab\\Ajula"); 
        if (f.exists())  
        {    
            System.out.println(f + " does exists.");
            System.out.println("Its size is" + f.length()+ "bytes"); 
            f.renameTo(f1);
            System.out.println("Renamed file name :" + f1 );  
            //System.out.println("deleting the renamed file"+f1);      
            //f.delete(); 
        }  
        else
            System.out.println(f +" does not exists"); 
   }                          
}


