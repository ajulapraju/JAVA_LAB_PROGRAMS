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
public class For
{
    public static void main(String a[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
        for(j=0;j<i;j++)
        {
        System.out.print(i);
        }
        System.out.println();
        }
    }
    
}
