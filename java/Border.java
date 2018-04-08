import java.awt.*;
import java.applet.*;
public class Border extends Applet
{
	public void init()
	{	
		setBackground(Color.green);
		setVisible(true);
		setSize(1366, 768);
		//setTitle("Frame Demo");
		setLayout(new BorderLayout(50, 50));

 

		add("North", new Button("North"));
		add("South", new Button("South"));

		add("East", new Button("East"));
		add("West", new Button("West"));

		add("Center", new Button("Center"));
	}
	public void start() 
	{
		
	}
}
