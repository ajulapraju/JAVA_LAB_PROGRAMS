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
public class Twoarray 
{
    public static void main(String args[])
    {
        int a[][]=new int[10][20];
        int n,m,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit of the row");
        n=sc.nextInt();
        System.out.println("enter the limit of the column");
        m=sc.nextInt();
        System.out.println("enter the array elements");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.println(a[i][j]);
                  System.out.println();
            }
          
        }
    }
    
}
