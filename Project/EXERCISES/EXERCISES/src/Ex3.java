import java.lang.reflect.Method;

public class Ex3
{

  public Ex3()
  {
    Class c;
    try
    {
      c = Class.forName("FooClass");
      Method m[] = c.getDeclaredMethods();
      System.out.println(m[0].toString());
    }
    catch (ClassNotFoundException e)
    {
      
      e.printStackTrace();
    }
  }

  public static void main(String[] args)
  {
    new Ex3();
  }

}