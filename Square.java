package practice;
public class Square {
    //----------------------------------------------------
    //Properties/Characteristics of Class : Member Variables
    int side;         // (A) Type: Instance | Object Variable
    // Are declared in a Class, but outside a method, constructor or any block
    // ->Get created when Object is created (new) and Get destroyed with it.
    // Have Default Values for Numbers=0 ; Booleans=False ; Object_refs=> null
    // Values can be assigned during declaration or within a constructor
    //----------------------------------------------------
    static int c;    // (B) Type: Static | Class Variable | One Copy Per Class
    //Are declared as static in a Class, outside a method, constructor or any block
    //Can be accessed using ClassName.variableName from any static function or constructor
    //----------------------------------------------------
    //Constructor for Initialization    //No Return Data Type  //Same Name as CLASSNAME
    Square()     {c++;System.out.println("created_ "+c+" with "+ side);}  //Default Constructor; No Parameters; No Body
    Square(int s){side=s;c++;System.out.println("created "+c+" with "+ side);}  //Override Constructor
    //----------------------------------------------------
    //Behavior of Class : Member Functions -// Type: Instance | Object Function
    public       //<==  Access Specifier 
    void         //<==  Return Data Type  
    calcArea()   //<==  Function Name
    {
        int area; //local variables
        area=side*side; System.out.println (side + "=" + area);
    }
    public static void main(String args[])
    {          //s1,s2 are reference variables
        Square s1=new Square();        s1.side=5;        s1.calcArea();
        Square s2=new Square();        s2.side=6;        s2.calcArea();
        Square s3=new Square();        s3.side=7;        s3.calcArea();
        Square s4=new Square(8);                    s4.calcArea();        
    }
}