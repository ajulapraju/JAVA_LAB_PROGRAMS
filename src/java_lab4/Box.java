/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab4;


 import java.util.*;
class Box 
{
 int l,b;
    void read()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter value of l");
        l=s.nextInt();
        System.out.println("enter value of b");
        b=s.nextInt();
       
    }
    void display()
    {
        System.out.println("Area of rectangle is : "+(l*b));
    }
}
 class Rectangle extends Box
{
    Scanner s=new Scanner(System.in);
    void read()
    {
    super.read();
    System.out.println("enter value of l");
    int l=s.nextInt();
   
    }
    void area()
    {
        int a=l*super.b*super.l;
    System.out.println("Area of Box is : "+a);
    }
    public static void main(String args[])
    {
        Box b=new Box();
        b.read();
       // b.area();
       
    }
}


   
