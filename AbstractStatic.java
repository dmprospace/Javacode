
public abstract class AbstractStatic {

  public static void main(String[] argv) {

    System.out.println("Hello. The answer is yes.");
 
    foo();
    AbstractStatic.foo(10);

  }

  public static void foo() {
    System.out.println("Hello from foo(). The answer is still yes.");
  }

          /* And if you think about it, of course non-abstract static
           * methods of an abstract class can be called. Isn't this
           * how most "factory methods" work?
           */

  public static void foo(int i) {
    System.out.println("Hello from foo("+i+")The answer is still yes.");
  }
}