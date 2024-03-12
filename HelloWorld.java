 /*
  * File: HelloWorld.java
  * Author: Java Java Java
  * Description: Prints Hello World greeting.
  */


public class HelloWorld extends Object         // Class header
{                                              // Start class body

  private static String greeting = "Hello World!";

  public static void greet()                   // Method definition
  {                                            // Start method body
      System.out.println(greeting);            // Output statement
  } // greet()  
    // End method body
 
  public void changeGreeting(HelloWorld h) // Non Static Method
  {
      greeting="See you!";
      h.greet();                           // calling non-static method from a static Method
  }

 //main is static (class) function 
 public static void main(String args[])        // Method header
 {
    HelloWorld helloworld;                      // declare
    helloworld = new HelloWorld();              // create
    helloworld.greet();                         // Method call
 
    helloworld.changeGreeting(helloworld); //call to non-static method to change a static variable

   greet(); //static function call
   System.out.println(greeting);
   


} // main()

} // HelloWorld class                          // End class body

