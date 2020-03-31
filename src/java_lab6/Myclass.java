/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab6;

/**
 *
 * @author P.P RAJU
 */import java.util.*;
interface A
{
    int inum1=20,inum2=10;//final 
    void meth1();
    void meth2();
}
public class Myclass implements A
{
    public void meth1()//definition
    {
        int inum1,inum2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values for addition ");
        inum1=sc.nextInt();
        inum2=sc.nextInt();
        System.out.println("Sum="+(inum1+inum2));
    }
    public void meth2()//definition
    {
        int inum1,inum2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values for Subtraction");
        inum1=sc.nextInt();
        inum2=sc.nextInt();
        System.out.println("Sub="+(inum1-inum2));
    }
    public static void main(String a[])
    {
       Myclass m=new Myclass();
       m.meth1();
       m.meth2();
    }
}
    

