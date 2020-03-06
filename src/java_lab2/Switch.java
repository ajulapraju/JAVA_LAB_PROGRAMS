/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab2;

/**
 *
 * @author MCALAB01021
 */import java.util.*;
public class Switch 
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mark of student");
        float M=sc.nextFloat();
        int x=(int)(M/10);
        switch(x)
        {
            case 10:
            case 9:
            case 8:System.out.println("distinction");
                    break;
            case 7:
            case 6:System.out.println("first class");
                    break;
            case 5:System.out.println("second class");
                    break;
            case 4:System.out.println("pass");
                    break;
            default:System.out.println("failed");
                    break;
        }
    }

}
