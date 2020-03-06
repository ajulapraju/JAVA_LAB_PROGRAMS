/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab3;

/**
 *
 * @author MCALAB01021
 */import java.util.*;
public class Data
{
    int x,y;
    void interchange(int x,int y)
    {
        int t=x;
        x=y;
        y=t;
        System.out.println("after swapping value of x="+x);
        System.out.println("after swapping value of y="+y);
    }
    public static void main(String args[])
    {int x,y;
     Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of x");
    x=sc.nextInt();
     System.out.println("enter the value of y");
    y=sc.nextInt();
    Data D=new Data();
    D.interchange(x,y);
    }

    
}
