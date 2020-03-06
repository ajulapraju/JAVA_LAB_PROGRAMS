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
public class Nestif 
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for HOD and 2 for others");
        int desg=sc.nextInt();
        System.out.println("enter 3 for female and 4 for male");
        int gender=sc.nextInt();
        System.out.println("enter the basic pay");
        float bp=sc.nextFloat();
        float ns=bp;
        if(desg==1)
        {
        ns=(float) (ns+0.10*bp);
        if(gender==3)
        ns=(float) (ns+0.10*bp);
        System.out.println(ns);
        }
        else
        {
        ns=(float) (ns+0.05*bp);
        if(gender==3)
        ns=(float) (ns+bp*0.05);
        }
        System.out.println(ns);
    }

}
