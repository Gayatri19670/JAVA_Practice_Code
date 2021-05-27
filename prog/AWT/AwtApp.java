import java.awt.*;

public class AwtApp extends Frame {

    AwtApp() {
        // this is for the firstName

        Label firstName = new Label("First Name");
        firstName.setBounds(100, 50, 80, 20);

        TextField firstNameTF = new TextField();
        firstNameTF.setBounds(250, 50, 150, 20);

        add(firstName);
        add(firstNameTF);
        // this is for the lastName
        Label lastName = new Label("Last Name");
        lastName.setBounds(100, 80, 80, 20);

        TextField lastNameTF = new TextField();
        lastNameTF.setBounds(250, 80, 150, 20);
        add(lastName);
        add(lastNameTF);

        // this is for the DOB

        Label dob = new Label("Date of Birth");
        dob.setBounds(100, 110, 80, 20);
        TextField dobTF = new TextField();
        dobTF.setBounds(250, 110, 150, 20);

        add(dob);
        add(dobTF);
        // this is for the Choice component

        Label genderLabel = new Label("Select Course ");
        genderLabel.setBounds(100, 140, 80, 20);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox Checkbox1 = new Checkbox("Male", cbg, false);
        Checkbox1.setBounds(250, 170, 150, 20);
        Checkbox Checkbox2 = new Checkbox("Female", cbg, false);
        Checkbox2.setBounds(250, 190, 150, 20);
        Checkbox Checkbox3 = new Checkbox("Other", cbg, false);
        Checkbox3.setBounds(250, 210, 150, 20);

        add(genderLabel);
        add(Checkbox1);
        add(Checkbox2);
        add(Checkbox3);

        // this is for the Checkbox component

        Label SelectCourse = new Label("Gender ");
        SelectCourse.setBounds(100, 170, 150, 20);

        Choice c = new Choice();
        c.setBounds(250, 140, 150, 20);
        c.add("Select");
        c.add("B.Tech");
        c.add("Polytechnic");
        c.add("B.Pharma");
        c.add("D.Pharma");
        c.add("MBA");
        c.add("BBA");
        c.add("B.Ed");
        c.add("BPES");

        add(SelectCourse);
        add(c);

        // this is for the Mobile No
        Label MobileNo = new Label("Mobile No ");
        MobileNo.setBounds(100, 250, 150, 20);
        TextField MobileNoTF = new TextField();
        MobileNoTF.setBounds(250, 250, 150, 20);

        add(MobileNo);
        add(MobileNoTF);
        // this is for the E-mail address
        Label EmailID = new Label("E-Mail ID ");
        EmailID.setBounds(100, 280, 150, 20);
        TextField EmailIDTF = new TextField();
        EmailIDTF.setBounds(250, 280, 150, 20);

        add(EmailID);
        add(EmailIDTF);

 // this is for the Student address
 Label StuAddress = new Label("Address ");
 StuAddress.setBounds(100, 300, 150, 40);
 TextField StuAddressTF = new TextField();
 StuAddressTF.setBounds(250, 310, 150, 40);

 add(StuAddress);
 add(StuAddressTF);



        // this is for the Submit and Reset button
        Button sbmt = new Button("Submit");
        sbmt.setBounds(150, 460, 100, 30);

        Button reset = new Button("Reset");
        reset.setBounds(250, 460, 100, 30);
        add(sbmt);
        add(reset);

        // this is for the size and other things for frame
        setSize(550, 550);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AwtApp awt = new AwtApp();
    }
}
