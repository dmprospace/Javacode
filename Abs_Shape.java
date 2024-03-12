package practice;

//public abstract class Abs_Shape {
public class Abs_Shape {    
    static int c;
    int width, height;
    String color;

    //public abstract void draw();

    Abs_Shape() {System.out.println("0 In ABS S " + c);}
    
    public void draw() {}
    public void SayHi()
    {
        System.out.println("SayHi from Abs_Shape!! " + color);
    }

}
