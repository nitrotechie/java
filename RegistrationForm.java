import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class RegistrationForm extends Frame implements ActionListener
{
	Label l1=new Label("Name : ");//OBJECT CREATE 
	Label l2=new Label("Email : ");//OBJECT CREATE
	Label l3=new Label(" ");//OBJECT CREATE
    Label l4=new Label("DOB : ");
	TextField t1=new TextField(10);//OBJECT CREATE
	TextField t2=new TextField(20);//OBJECT CREATE
	TextField t3=new TextField(10);//OBJECT CREATE
	Button b=new Button("Register");//OBJECT CREATE
	public RegistrationForm()
	{
        add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		add(l3);
        add(l4);
        add(t3);
		l1.setBounds(20,45,70,20);
		t1.setBounds(180,45,200,20);
		l2.setBounds(20,95,70,20);
		t2.setBounds(180,95,200,20);
        l4.setBounds(20,135,70,20);
		t3.setBounds(180,135,200,20);
		b.setBounds(150,170,100,50);
		b.addActionListener(this);
		addWindowListener(new As());
	}
	public void actionPerformed(ActionEvent e)
	{ 
		l3.setText("SUBMITTED "+t1.getText());
	}
	public static void main(String s[])
    {
		RegistrationForm l=new RegistrationForm();
		l.setSize(new Dimension(400,400));
		l.setTitle("Registration Form");
		l.setVisible(true);
   }//end of main
}//end of class loginform
 class As extends WindowAdapter
{ 
	public As(){}
	public void WindowClosing(WindowEvent e)
   { 
	System.exit(0);
   }
}