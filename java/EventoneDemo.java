import javax.swing.*;
import javax .awt.event.*;
public class EventoneDemo extends JFrame implements ActionListener{
	JButton b1;
	public static void main(String[] args) {
		MyEvent event =new MyEvent();
		}
		public MyEvent(){
			super("window title: event HAndling");
			b1=new JButton("click me");
			getContentpane().add(b1);
			b1.addActionListener(this);
			setVisible(true);
			setSize(250,250);



		}
		public void actionPerformed(ActionEvent evt)
		{
			JButton source =(JButton)evt.getSource();
			source.setText("mouse clicked !");



		}
	
}	