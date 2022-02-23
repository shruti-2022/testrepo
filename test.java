import java.util.*;
import java.io.*;
class emp
{
{
    String firstname;
    String lastname;
    double msal;
}
public emp()
{
    firstname=" ";
    lastname=" ";
    msal=0;
}
void get()
{
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter firstname:");
    firstname=sc.next();
    System.out.println("enter lastname:");
    lastname=sc.next();
    System.out.println("enter monthly salary:");
    msal=sc.nextdouble();
    if(msal<0)
    {
        msal=0.0;
    }

}
void put()
{
    System.out.println("firstname is:"+firstname);
    System.out.println("lastname is:"+lastname);
    System.out.println("full name is:"+firstname+" "+lastname);
    System.out.println("monthly salary is:"+msal);
    System.out.println("per year salary:"+msal*12);
}
class test()
  {
    public static void main(String args[])
    {
        emp e1=new emp();
        System.out.println("employee details:");
        e1.get();
        e1.put();
}

}
}