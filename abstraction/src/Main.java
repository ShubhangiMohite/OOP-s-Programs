abstract class Animal   // No use of class no need to show these class to user hence we make this class as abstract
{
    Animal()
    {
        System.out.println("we creating new animal");
    }
    abstract public void walk();

}
class Horse extends Animal
{
    Horse()
    {
        System.out.println("we creating new horse");
    }
    public void walk()
    {
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal {
    public void walk()
    {
        System.out.println("walks on 2 legs");
    }

}
public class Main
{
    public static void main(String[] args)
    {
         Horse horse = new Horse();
        // horse.walk();
//         Animal a =  new Animal();  // can not create the object of abstract class
//         a.walk();
    }
}
