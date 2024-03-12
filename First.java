package a;
public class First     
{
    static int c;
    // STATIC VARIABLE    // - Memory Accessible inside static Function only
    // - Single copy in Memory     // - Class Area    // - Class Variable
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Printed c=" + c);
        c++;
        System.out.println("Printed c=" + c);
        // One Dimensional Array
        double marks[]= {50,60,80,90,84};
        for (int i=0; i<5; i++)
        {
            System.out.println(marks[i]);        
        }
        for (double d:marks)
        {
            System.out.println(d);
        }
    }
}

