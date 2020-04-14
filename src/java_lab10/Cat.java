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
public class Cat {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        try
        {
        System.out.println("enter the value of x");
        int x=sc.nextInt();
        int y=10/x;
        int ar[]={2,3,4};
        System.out.println(ar[x]);
        System.out.println("enter the value of x1");
        int x1=sc.nextInt();
        System.out.println("enter the array");
        int ar1[]=new int[x1];
        }
    catch(ArithmeticException e)
    {
        System.out.println(e);
    }  
    catch(ArrayIndexOutOfBoundsException e)
    {
         System.out.println(e);
    }
    catch(Exception e)
    {
         System.out.println(e);
    }

}
}
