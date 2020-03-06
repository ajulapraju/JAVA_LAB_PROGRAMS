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
public class Simpleif 
{
 public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        {
        System.out.println("a is larger");
        }
        if(b>a)
        {
        System.out.println("b is larger");
        }  
        
    }
}
