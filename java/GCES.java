import java .awt.*;
import java.applet.*;
public class GCES extends Applet{

		public void init(){}
		public void start()
		{
			
			
				setVisible(true);
				setSize(200,300);
				setBackground(Color.green);
				setLayout(new FlowLayout(10,20,30));
				Label username=new Label("USERNAME");
				Label password=new Label("PASSWORD");
				Button btn =new Button("Login");
				TextField uname=new TextField(30);
				TextField pass=new TextField(30);	
				add(username); 
				add(uname);
	
				add(password); 
				add(pass);
		
				add(btn);
		}
		}

