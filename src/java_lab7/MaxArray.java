/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javalab7;

/**
 *
 * @author P.P RAJU
 */import java.util.*;
public class MaxArray 
{
    void Max(int a[], int low, int l) 
    { 
       int m= a[0]; 
       int i; 
       for (i=low;i<=l;i++) 
       { 
           if (a[i] > m) 
              m = a[i]; 
       } 
       System.out.println("Maximum element in array is "+ m); 
    } 
    public static void main (String[] args)  
    { 
        int l;
        int a[]=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array limit");
        l=sc.nextInt();
        System.out.println("Enter "+ l +" array elements");
        for (int i=1; i <=l;i++) 
        {
            a[i]=sc.nextInt(); 
        }
        MaxArray ma=new MaxArray();
        ma.Max(a,1,l); 
    }  
}   

