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
public class Matrixadd
{
    public static void main(String args[])
    {
       
        int a[][]= new int[10][10];
        int b[][]= new int[10][10];
        int c[][]= new int[20][20];
        int i,j,n,m,p,q;
        Scanner S=new Scanner(System.in);
        System.out.println("enter the row size");
        n=S.nextInt();
        System.out.println("enter the col size");
        m=S.nextInt();
        System.out.println("enter the array elements");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=S.nextInt();
            }
        }
        System.out.println("enter the row size");
        p=S.nextInt();
        System.out.println("enter the col size");
        q=S.nextInt();
        System.out.println("enter the array elements");
        for(i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
                b[i][j]=S.nextInt();
            }
        }
        System.out.println("After addition");
        for(i=0;i<n;i++)
        {
            for(j=0;j<q;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]);
            }
            System.out.println();
           
           
        }
    }
   }
