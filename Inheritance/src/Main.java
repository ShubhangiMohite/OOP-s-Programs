import java.util.*;
import bank.*;
class Shape
{
    String color;
    public void area()
    {
        System.out.println("display area");
    }
}
//class Triangle extends Shape
//{
//    public void area(int l, int h)
//    {
//        System.out.println(1 / 2 * l * h);
//    }
//}

class Circle extends Shape
{
    public void area1(int r)
    {
        System.out.println((3.14)*r*r);
    }
}

public class Main
{
    public static void main(String args[ ])
    {
       // Triangle t1 = new Triangle();
        Circle c1 = new Circle();
        c1.area1(67);
        //bank.Bank a = new bank.Bank();
        //a.data= "data";
        c1.area();

    }
}