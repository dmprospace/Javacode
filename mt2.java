class Outer {
  static class Inner1 {
    Inner1 () {
      System.out.println("Inner1");
    }
    class Inner2 {
      Inner2 () {
       System.out.println("Inner2"); 
      }
      
    }
  }
  
}


public class mt2 {
  
  public static void main(String args[]) {
    
   Outer.Inner1 in1 = new Outer.Inner1(); //Line1
   Outer.Inner1.Inner2 in2 = new Outer.Inner1().new Inner2(); //Line2
    
  }
  
  
}