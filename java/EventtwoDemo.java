import java.awt.*;
import java.awt.event.*;
public class EventtwoDemo  implements ActionListener{
	 Frame f= new Frame();
	
		public EventtwoDemo(){
		
		f.setVisible(true);
		f.setSize(200,300);
		f.setBackground(Color.gray);
		Button b=new Button("click me");
		f.add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evt)
		{
			Dialog d=new Dialog(f, "Dialog" , true);
			d.add(new Label("added successfully"));
			d.show();
		}
	public static void main(String[] args) {
		new EventtwoDemo();
	}
	
}



		



