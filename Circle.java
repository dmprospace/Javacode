// This Program Demonstrates the Static members of Class
// Setting them in Static and Non Static Context and results
//
// This Also demonstrates Persistence/Static Nature of Static or Class variables
// i.e They are accessible even after objects are destroyed, but only directly
// All objects share same copy from Loaded Class 
//
// Also Demonstrates very silly recursive call back to main() -- Commented fails

public class Circle {

    public static double radius; //Static Var-- Always ONE COPY in Memory Per class 
                                // :) :P Except in case of recursion when Value is pushed on Stack for recursive function call

    public static int i; // Static variable
    
    public int j=10; // Non Static Variable

    double getRadius() { // Non Static Method //can access static and non static variables
        System.out.println("this.j="+this.j); 
        return radius;
    }

    static double getRadiusStatic() {
        return radius;
    }

    Circle(){
        super();
        this.radius=1.0;
    }

    public static void main(String[] args){
        

        System.out.println("\n..........................................................\n");
        i=Integer.parseInt(args[0]); //Convert String object to int
        System.out.println("In Main i="+i);                // Static Context
        System.out.println("radius="+radius); //Will print default value 0.0 - Static Context
        System.out.println("getRadiusStatic="+getRadiusStatic()); 
        
        // New Object ready ; no more static context
        Circle c = new Circle();        
        System.out.println("getRadiusStatic="+getRadiusStatic()); //will print 1.0

        System.out.println("c.getRadiusStatic="+c.getRadiusStatic());
        System.out.println("c.getRadius="+c.getRadius()); 
    
        System.out.println("c.j="+c.j); 

        
        try{
            if (i <=3)
            {
                i++;
                String [] ss = new String[]{String.valueOf(i)}; // Convert int to String
                System.out.println("\nobject c is -- "+c);
                //c.main(ss); //Silly Recursion Here :P
                
            }else{ 
                System.out.println("Returning Recursion !!");
                return;
            }    
        }
        catch(StackOverflowError e){
            e.printStackTrace();
        }

        i--;
        radius=i;
    
        
        System.out.print("\nAfter Deleting object 'c' which is="+ c);
        c=null;
        System.out.println(" radius="+radius);

        try{
            System.out.println(c.getRadius());
        }
        catch(Exception e){
            System.out.println("getRadius excp i="+i+"\n");
            
            //e.printStackTrace();
        }
        System.out.println("getRadiusStatic="+getRadiusStatic());



    }// Main Ends Here
}