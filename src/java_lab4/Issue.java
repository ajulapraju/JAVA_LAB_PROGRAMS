/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab4;

/**
 *
 * @author MCALAB01021
 */ import java.util.*;
class Publisher
{
    int pno;
    String name;
    void read()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter publisher no");
        pno=s.nextInt();
        System.out.println("enter publisher name");
        name=s.next();
    }
    void display()
    {
        System.out.println("enter publisher no is "+ pno);
        System.out.println("enter publisher name is " + name);
    }
   
}
class Book extends Publisher
{
    int price;
    String bname;
    void read()
    {   
        super.read();
        Scanner s=new Scanner(System.in);
        System.out.println("enter Book price ");
        price=s.nextInt();
        System.out.println("enter Book name");
        bname=s.next();
        
    }
    void display()
    {
        System.out.println("enter Book name "+bname);
        System.out.println("enter book price "+price);
        super.display();
    }
}
public class Issue extends Book
{
    String iname;
    @Override
    void read()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter issue name");
        iname=s.next();
        super.read();
    }
    @Override
    void display()
    {
        System.out.println("enter issue name "+iname);
        super.display();
    }
    public static void main(String args[])
    {
        Issue I=new Issue();
        I.read();
        I.display();
    }
}
    

