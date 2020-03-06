/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab1;

/**
 *
 * @author MCALAB01021
 */
public class Message1 
{
         byte b;
	 short s;
	 int i;
	 long l;
	 char c;
	 String s1;
	 boolean bo;
	public static void main(String a[])
	{
	Message1 d=new Message1();
	System.out.println("size of byte="+d.b);
	System.out.println("size of short="+d.s);
	System.out.println("size of int="+d.i);
	System.out.println("size of long="+d.l);
	System.out.println("size of char="+d.c);
	System.out.println("size of string="+d.s1);
	System.out.println("size of boolean="+d.bo);
	}   
}
