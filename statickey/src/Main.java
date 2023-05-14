public class Main
{
    String name;
    static String school;
    public static void changeSchool()
    {
        school = "datascience";

    }
    public static void main(String[] args)
    {
       Main.school = "Jubilee";
        Main m = new Main();
        m.name = "prashala";
        m.school = "raghVendra";
        System.out.println(school);
        System.out.println(m.name );
        m.changeSchool();
        System.out.println(school);

    }
}