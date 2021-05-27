import java.awt.*;

public class AwtApp extends Frame {

    AwtApp() {
        // this is for the firstName

        Label firstName = new Label("First Name");
        firstName.setBounds(20, 50, 80, 20);

        TextField firstNameTF = new TextField();
        firstNameTF.setBounds(120, 50, 100, 20);
        // this is for the lastName
        Label lastName = new Label("Last Name");
        lastName.setBounds(20, 80, 80, 20);

        TextField lastNameTF = new TextField();
        lastNameTF.setBounds(120, 80, 100, 20);
        // this is for the DOB

        Label dob = new Label("Date of Birth");
        dob.setBounds(20, 110, 80, 20);
        TextField dobTF = new TextField();
        dobTF.setBounds(120, 110, 100, 20);

        // this is for the Choice component

        Label genderLabel = new Label("Select Course ");
        genderLabel.setBounds(20, 150, 80, 20);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox Checkbox1 = new Checkbox("Male", cbg, false);
        Checkbox1.setBounds(120, 180, 100, 20);
        Checkbox Checkbox2 = new Checkbox("Female", cbg, false);
        Checkbox2.setBounds(120, 200, 100, 20);
        Checkbox Checkbox3 = new Checkbox("Other", cbg, false);
        Checkbox3.setBounds(120, 220, 100, 20);

        // this is for the Checkbox component

        Label SelectCourse = new Label("Gender ");
        SelectCourse.setBounds(20, 180, 100, 20);

        Choice c = new Choice();
        c.setBounds(120, 150, 100, 20);
        c.add("B.Tech");
        c.add("Polytechnic");
        c.add("B.Pharma");
        c.add("D.Pharma");
        c.add("MBA");
        c.add("BBA");
        c.add("B.Ed");
        c.add("BPES");

        Button sbmt = new Button("Submit");
        sbmt.setBounds(20, 260, 100, 30);

        Button reset = new Button("Reset");
        reset.setBounds(120, 260, 100, 30);

        add(firstName);
        add(lastName);
        add(dob);
        add(genderLabel);
        add(firstNameTF);
        add(lastNameTF);
        add(dobTF);
        add(c);
        add(sbmt);
        add(reset);
        add(Checkbox1);
        add(Checkbox2);
        add(Checkbox3);

        add(SelectCourse);

        setSize(600, 600);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AwtApp awt = new AwtApp();
    }
}
