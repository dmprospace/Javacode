package practice;

//Parent Class 
//        Shape
//    +-----+----+-------+      
// Rectangle   Triangle Circle  
//
// IS-A relations / Parent-Child
//
// Child Class shares some common properties /behavior of the shape class
//   Also called sub-class of Super class
public class Shape 
{
    static int c;
    int width, height;
    String color;

    Shape() {c++; System.out.println("In Shape " + c);}

    public void SayHi() {
        System.out.println("SayHi from Shape!! " + c);
    }
}
