package practice;

public class Rectangle extends Abs_Shape implements an_inf
{
//Inheritance Makes it subclass of shape
/*    Rectangle() 
    { 
        
        
    }
*/
    Rectangle(int w, int h) 
    {
      // Variables can be initialized without defining them again
      // in the sub class => characteristics are inherited
        super();  //Implicit Constructor Call
        System.out.println("x In Rectangle " + c);
        width = w;   // no need to declare/define again
        height = h;
        c++;
        System.out.println("> In Rectangle " + c);
        //this.SayHi();
    }
    //Method Overriding
    public void SayHi() {
        super.SayHi();
        System.out.println("SayHi from Rectangle!! "+c);
    }
    public void draw() 
    {
        super.SayHi();
        System.out.println("SayHi from Rectangle!! "+c);
    }
}
