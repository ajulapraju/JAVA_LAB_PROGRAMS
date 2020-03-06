/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab2;

/**
 *
 * @author MCALAB01021
 */import java.util.*;
public class Ladder 
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mark of student");
        float M=sc.nextFloat();
        float bp = 0;
        float ns=bp;
        if(M>=80)
        {
        System.out.println("distinction");
        }
        else if(M>=60)
        {
        System.out.println("first class");
        }
        else if(M>=50)
        {
        System.out.println("second class");
        }
        else if(M>=40)
        {
        System.out.println("pass");
        }
        else
        {
        System.out.println("failed");
        }

   
    }

}
