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
public class Box {
 int length,breadth,height,area;
 Box(){
     length=0;
     breadth=0;
 }
 void setvalue(int x,int y)
 {
     length=x;
     breadth=y;
 }
 void area()
 {
     area=length*breadth;
 
 }
 void display()
 {
     System.out.println("area of box is:"+area);
 }
}
class Box3d extends Box
{
    int height,volume;
    public Box3d(int x,int y)
    {
        super();
        height=0;
    }
    
    void setval(int x,int y,int z)
    {
        super.setvalue(x, y);
        height=z;
    }
    void volume()
    {
        volume=length*breadth*height;
    }
    void display()
    {
        System.out.println("Volume of box is:"+volume);
    }
    public static void main(String args[])
    {
        Box b1=new Box();
        Box3d b2=new Box3d(10,20);
        b1.setvalue(10, 20);
        b2.setval(10,20,30);
        b1.area();
        b1.display();
        b2.volume()
        b2.display();
    }
}