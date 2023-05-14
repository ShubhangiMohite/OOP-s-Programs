class Student
{
    String name;
    int rollNo;

    public void printInfo(String name, int rollNo)
    {
        System.out.println(name+ "  " +rollNo);
    }
    public void printInfo(int rollNo)
    {
        System.out.println(rollNo);
    }

}
public class Main
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name = "Shubhangi";
        s1.rollNo = 13;
        
        s1.printInfo(s1.name,s1.rollNo);
        s1.printInfo(s1.rollNo);

    }
}