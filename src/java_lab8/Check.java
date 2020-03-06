/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab8;

/**
 *import java.lang. Math*;
 * @author MCALAB01021
 */
public class Check 
{
    private double d;
    
    Check()
    {
       d=25.0;
       System.out.println(d);
    }
    boolean isZero()
    {
        System.out.println("d is zero");
        if(d==0.0)
        {
            return true;
        }
        else
            return false;
    }
    boolean isPositive()
    {
        System.out.println("d is positive number");
        if(d>0)
        {
            return true;
        }
        else
            return false;
    }
    boolean isNegative()
    {
        System.out.println("d is negative number");
        if(d<0)
        {
            return true;
        }
        else
            return false;
    }
    boolean isOdd()
    {
        System.out.println("d is odd number");
        if(d%2!=0)
        {
            return true;
        }
        else
            return false;
    }
    boolean isEven()
    {
        System.out.println("d is even number");
        if(d%2==0)
        {
            return true;
        }
        else
            return false;
    }
     boolean isPrime()
    {
        System.out.println("d is prime number");
        int c=0,i=1;
        while(i<=d)
        {
            if(d%i==0)
            {
                c++;
            }
                i++;
        }
        if(c==2)
        {
           return true; 
        }
        else
            return false;
    }
    boolean isAmstrong()
    {
        double total=0;
        double t = d;
        while (t!= 0)
        {
            double temp = d % 10;
            total = total+(temp*temp*temp);
            d /= 10;
        }

        if(total==d)
        {
            return true;
        }
        else
            return false;
    }
   double getFactorial()
    {
        int fact=1;
        for(int i=1;i<=d;i++)
        {    
        fact=fact*i;    
        }
        return fact;
    }
    double getSqrt()
    {
        d=Math.sqrt(d);
        return d;
    }
    double getSqr()
    {
        d=d*d;
        return d;
    }
    double sumDigits()
    {
        double m=0,sum=0;
        while(d>0)
           {
               m=d%10;
               sum=sum+m;
               d=d/10;
           }
         return sum;
    }
    double getReverse()
    {
        double r=0;
        while(d != 0) 
        {
            double digit = d % 10;
            r = r * 10 + digit;
            d /= 10;
        }
        return r;  
    }
    public static void main(String args[])
    {
        double d;
        Check c=new Check();
        System.out.println(c.isZero());
        System.out.println(c.isPositive());
        System.out.println(c.isNegative());
        System.out.println(c.isOdd());
        System.out.println(c.isEven());
        d=c.getReverse();
        System.out.println(d);
        d=c.getSqr();
        System.out.println(d);
        d=c.getSqrt();
        System.out.println(d);
    }
}
