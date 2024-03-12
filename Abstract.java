abstract class AbstractFather
{
    AbstractFather(){}
    protected int i;
    public abstract void setValue(int n) ;
    public abstract int getValue();
}
///////////////////////////////////////////////////////////////////
class Son extends AbstractFather
{
    final int k=10;
    Son ()
    {
        System.out.println("Object of Son is created");
    }
    public void setValue(int n){
        i=n;
    }
    public int getValue(){
        return i;
    }
}
///////////////////////////////////////////////////////////////////
class Grandson extends Son
{
    int i;
    Grandson() 
    {
        System.out.println("object of Grandson is created");
    }
}

public class Abstract {
    public static void main (String[] args) {        
            
        Abstract a = new Abstract(); // 
        AbstractChild ac  = new AbstractChild ();
        //Son s = new Son();
        //s.setValue(2);
        //System.out.println(s.getValue());
        Grandson g= new Grandson();
        g.setValue(3);
        System.out.println(g.getValue());
        Son son=new Grandson();
    }
} // Abstract class
///////////////////////////////////////////////////////////////////
class AbstractChild extends Abstract
{
     AbstractChild(){
        System.out.println("AbstractChild Created");
     }
    
}
///////////////////////////////////////////////////////////////////