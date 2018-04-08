import java.awt.*;
import java.awt.event.*;
public class EventsAllDemo extends Frame implements ActionListener
	{
		
		TextField t;
		EventsAllDemo(){	
		
		Frame f=new Frame();
		f.setVisible(true);
		f.setSize(300,400);
		f.setBackground(Color.white);
		f.setLayout(null);
		t= new TextField();
		t.setBounds(50,50, 150,20);  
		Button b1=new Button("click here");
		b1.setBounds(50,100,60,30);  
		b1.addActionListener(this);
		
	    f.add(b1);
	    f.add(t);
	}
		public void actionPerformed(ActionEvent e){
			t.setText("welcome");
		}
		public static void main(String[] args) 
		{
			new EventsAllDemo();
		}
	
	}

