import java.awt.*;
class FrameDemo{
	public static void main(String [] args)
	{
	Frame f= new Frame();
	f.setVisible(true);
	f.setSize(200,300);
	f.setBackground(Color.green);
        f.setTitle("this is my first gui page");
	f.setLayout(new FlowLayout(10,20,30));
	Label username=new Label("USERNAME");
	Label password=new Label("PASSWORD");
	Button btn =new Button("Login");
	TextField uname=new TextField(30);
	TextField pass=new TextField(30);	
	f.add(username); 
	f.add(uname);
	
	f.add(password); 
	f.add(pass);
	f.add(btn);		
	}


}
	
