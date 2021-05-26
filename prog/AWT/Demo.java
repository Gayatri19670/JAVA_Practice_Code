import java.awt.*;


public class Demo {
   Demo(){
    //    creating Frame
    Frame fr = new Frame("Demo Example");
    // creating a label
    Label lb = new Label("User ID :");
    // Adding Label to the frame
    fr.add(lb);
    // Creating Text Field
    TextField t = new TextField();
    t.setSize(100, 10);
    // addind text field to the frame 
    fr.add(t);
    Button b= new Button("Click me");
    b.setBounds(60,200,160,60);
    fr.add(b);
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
