/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab2;

/**
 *
 * @author MCALAB01021
 */ import java.util.*;
public class Digittriangle 
{
    public static void main(String s[])
    {
        int i,j,n;
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the limit");
        n=Sc.nextInt();
        for(i=0;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
         }
       
    }
}

