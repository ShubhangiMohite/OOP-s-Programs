package bank;

class Account
{
    //protected String name;
    private String name1;

    public String getName1()
    {
        return name1;
    }
    public void setName1(String n)
    {
        this.name1 = n;
        //System.out.println(this.name1);
    }

}
public class Bank
{
    //public String data;
    public static void main(String a[])
    {
        Account a1 = new Account();
      a1.setName1("Makan");
        System.out.println(a1.getName1());
    }

}
