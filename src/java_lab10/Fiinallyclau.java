/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab10;

/**
 *
 * @author P.P RAJU
 */import java.util.*;
public class Fiinallyclau 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array limit");
            int x=sc.nextInt();   
            try
            {
                int ar[]=new int[x];
                ar[x]=50;
            }
        catch(NegativeArraySizeException ei)
        {
            System.out.println("Negative size"+ei); 
        }
        catch(ArrayIndexOutOfBoundsException eo)
        {
            System.out.println("ArrayoutofBound"+eo);
        }
        finally
        {
            System.out.println("finally block");
        }
        System.out.println("program continues......");
        
    }
}
    

