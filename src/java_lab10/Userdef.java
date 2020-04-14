/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab10;

/**
 *
 * @author P.P RAJU
 */import java.util.*;
class MyException extends Exception
{
    public String toString()
    {
        return "\tthe no is not divisible by 2\t";
    }
}
public class Userdef {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x");
        int x=sc.nextInt();
        try
        {
            if(x%2!=0)
            {
                throw new MyException();
            }
        }
        catch(MyException ei)
        {
            System.out.println("MyException"+ei);
        }
    }
}
    
    

