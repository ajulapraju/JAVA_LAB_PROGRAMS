/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab9;

/**
 *
 * @author P.P RAJU
 */
public class Override {
    void value()
    {
        System.out.println("Null");
    }
    void value(int a,int b)
    {
        System.out.println("Value of a&b:"+a+" "+b);
        
    }
    void value1(double a)
    {
        System.out.println("value of a:"+a);
    }
    public static void main(String args[])
    {
        Override O=new Override();
        O.value();
        O.value(10, 5);
        O.value1(12.8);
    }
}

