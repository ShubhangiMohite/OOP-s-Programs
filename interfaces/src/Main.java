interface Animal
{
    int eyes = 2;
    void walk();  // by default abstract method
}
interface Herbivore
{

}
class Horse implements Animal,Herbivore
{
    public void walk()
    {
        System.out.println("walks on 4 legs");
    }
}
public class Main
{
    public static void main(String[] args)
    {
         Horse horse = new Horse();
         horse.walk();
    }
}