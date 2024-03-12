public class Abstract {
    int num;

    public NumberThread(int n) {
        num = n;
    }
    public void run() {
        for (int k=0; k < 10; k++) {
            System.out.print(num);
        } // for
    } // run()

public static void main (String[] args) {

}

} // abstract class

