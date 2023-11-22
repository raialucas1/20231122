import java.util.Scanner;
public class MyClass
{
  public static void main (String args[])
  {
    String vUserName = "teste";
    String vPass = "teste";
    Scanner scanner = new Scanner (System.in);
      System.out.print ("Enter user name:");
    String userName = scanner.nextLine ();
      System.out.print ("Enter password:");
    String pass = scanner.nextLine ();

    if (vUserName.equals (userName) && vPass.equals (pass))
      {
	System.out.print ("Sucess");

      }
    else
      {
	System.out.print ("User or password invalid");
      }
  }
}
