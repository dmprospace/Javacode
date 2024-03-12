public class AnoClass {

  public static void main(String[] args) {
    Ball b = new Ball() 
                
                // Anon-block begins here 
                {
                    //hit Function Implementation here 
                    public void hit() 
                    {
                        System.out.println("You hit it!");
                    }
                };
                // Anoclass ends here 
    b.hit();
  }

  
// This is not class this is an interface ; Mind it , Rascala !
   // And we have instantiated this Interface above

  public interface Ball {

    abstract void hit(); //Abstract Fn
  }
}

   
