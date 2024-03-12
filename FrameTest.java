import java.awt.* ;

public class FrameTest extends Frame {

    public FrameTest() {
       super("FrameTest") ;
       setSize(300,400) ;
       setVisible(true) ;
       Component b = new Button("Button") ;
       Component c = new Button("Button2") ;
       add(c) ;
       add(b) ;
    }
    public static void main(String[] args) {
       FrameTest frame = new FrameTest() ;
    }
}