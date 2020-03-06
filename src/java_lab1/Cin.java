/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab1;

/**
 *
 * @author MCALAB01021
 */import java.util.*;
public class Cin
{
     int r;
    double a;
 
   
    void area( int r)
    {
        this.r=r;
        a=3.14*r*r;
        System.out.println("area of circle:"+a);
       
       
    }

    void volume(int h, int r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
 class Bin extends Cin
{
    int h;
    void volume(int r,int h)
    {
        this.r=r;
       // Scanner s=new Scanner(System.in);
        //System.out.println("enter height");
        double volume=(3.14*r*r*h);
        System.out.println("volume of the cylinder is:"+volume);
    }
   
}
   public class Inherit extends Bin
    {
        public static void main(String a[])
        {
            int r,h;
            Scanner s=new Scanner(System.in);
            System.out.println("enter radius");
             r=s.nextInt();
            System.out.println("enter height");
             h=s.nextInt();
          //  a i=new a();
            //i.read(r);
            //b new = new b();
            Cin I=new Cin();
            I.area(r);
            I.volume(h,r);
        }
       
    }

    

