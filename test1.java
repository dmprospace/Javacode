//package com.witscale.scjp.examples;        // Package declaration
//import java.util.String;                   // import statement(s)

public class test1 {                        // class declaration.
   public static void main(String[] args) 
   {
    if (args[0] != null || args[0] == null)  // Always True
    {
        args[0]="Devesh";
    }
    
    String name = new String ("Kumar");
    String[] names  =  new String[ ] {"","",""};
    String[] names1 =  new String[3];   

    names[0]="Mickey";
    names[1]="Pluto";
    names[2]="JarJar";
    
    System.out.println(args[0]);
    System.out.println();
    args[0]="Mohnani";
    System.out.println(args[0]);
    System.out.println();

    for (int i =0; i<=2;i++ )     {      System.out.println(names[i]);    }
    for (int i =0; i<=2;i++ )     {      System.out.println(names1[i]);    }

    test2 t=new test2();
    t.i=10;
    System.out.println(t.i);

    t.setall(20);
    print_hello_world();
  }

  public static void print_hello_world()
  {
    System.out.println("Hello World");
  }
}
 
class test2
{
    int i=0;
    private int m=1;
    protected int n=10;

    public void setall (int j)
    {
        i=j;
        m=200;
        n=300;
    }
    public int getm(){
        return m;
    }
}