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
public class Ifelse 
{
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        a = sc.nextInt();
        if(a%2==0)
        {
        System.out.println("it is an even number");
        }
        else
        System.out.println("it is an odd number");
    }
    
}
