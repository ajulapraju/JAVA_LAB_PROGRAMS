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
public class Throwclau{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x");
        int x=sc.nextInt();
        try
        {
            if(x==0)
                throw new ArithmeticException();
            System.out.println(10/x);
            
        }
        catch(ArithmeticException ei)
        {
            System.out.println("ArithmeticException"+ei);
        }
    }
    
}
