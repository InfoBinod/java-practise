import java.awt.*;
import java.awt.event.*;
public class EventDemo{
	public static void main(String[] args) {
		Frame f= new Frame();
		public EventDemo(){
		f.setVisible(true);
	    f.setBackground(Color.white);
	    f.setSize(200,300);
	    f.setLayout(new GridLayout(6,2));
	    f.add(new Label("first name"),new TextField(30));
	}
}
