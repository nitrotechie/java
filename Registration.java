import java.awt.*;
class Registration extends Frame{
    Registration() {
        Label name   = new Label("Name : ");
		Label enrollno = new Label("Enrollment No : ");
		Label email  = new Label("Email : ");
		Label gender  = new Label("Gender : ");
		Label dob  = new Label("DOB : ");
        CheckboxGroup cgender = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", false); 
        Checkbox female = new Checkbox("Female", false); 
        TextField tfname = new TextField();
        TextField tfenrollno = new TextField();
        TextField tfemail = new TextField();
        TextField tfdob = new TextField();
        Button submit = new Button("Submit");
        add(name);
        add(enrollno);
        add(email);
        add(gender);
        add(male);
        add(female);
        add(tfname);
        add(tfenrollno);
        add(tfemail);
        add(tfdob);
        add(submit);
        add(dob);
        name.setBounds(15, 30, 100, 20);
        tfname.setBounds(120, 30, 250, 20);
        enrollno.setBounds(15, 60, 100, 25);
        tfenrollno.setBounds(120, 60, 250, 20);
        email.setBounds(15, 90, 100, 20);
        tfemail.setBounds(120, 90, 250, 20);
        dob.setBounds(15, 120, 100, 20);
        tfdob.setBounds(120, 120, 250, 20);
        gender.setBounds(15, 150, 100, 20);
        male.setBounds(120, 150, 250, 20);
        female.setBounds(120, 170, 250, 20);
        submit.setBounds(30, 250, 200, 30);
        setTitle("Registration Form");
		setSize(460,390);
		setLayout(null);
		setVisible(true);
    }
    public static void main(String[] args) {
        new Registration();
    }
}