import java.awt.*;

import jdk.internal.org.objectweb.asm.Label;
import jdk.internal.org.objectweb.asm.tree.analysis.Frame;
public class Demo {
   Demo(){
    //    creating Frame
    Frame fr = new Frame("Demo Example");
    // creating a lebal
    Lable lb = new Label("User ID :");
    // Adding Label to the frame
    fr.add(lb);
    // Creating Text Field
    TextField t = new TextField();
    // addind text field to the frame 
    fr.add(t);
    // setting frame size 
    fr.setSize(500, 300);
    // setting the layout for the frame 
    fr.setLayout(new FlowLayout());
    fr.setVisible(true);
   }
        public static void main(String[] args) {
            Demo ex = new Demo();
        }
   
}
