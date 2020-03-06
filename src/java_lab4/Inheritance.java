/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab4;

/**
 *
 * @author MCALAB01021
 */import java.util.*;
class A
{
    int r;
    double a;
 
   
    void area( int r)
    {
        this.r=r;
        a=3.14*r*r;
        System.out.println("area of circle:"+a);
       
       
    }
}

 class B extends A
{
    int h,r;
    void volume(int r,int h)
    {
        this.r=r;
        double volume=(3.14*r*r*h);
        System.out.println("volume of the cylinder is:"+volume);
    }
   
}
   public class Inheritance extends B
    {
        public static void main(String args[])
        {
            int r,h;
            Scanner s=new Scanner(System.in);
            System.out.println("enter radius");
             r=s.nextInt();
            System.out.println("enter height");
             h=s.nextInt();
            Inheritance I=new Inheritance();
            I.area(r);
            I.volume(h,r);
        }
       
    }

    

