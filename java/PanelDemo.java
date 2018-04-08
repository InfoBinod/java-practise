import java.awt.*;
public class PanelDemo{
	public static void main(String[] args) {
		Frame f= new Frame();
		f.setVisible(true);
	    f.setBackground(Color.white);
	    f.setSize(200,300);
	    f.setLayout(new GridLayout(6,2));
	    Panel p= new Panel();
	    Panel p2=new Panel();
	    p.setBackground(Color.gray);
	    //p.setSize(100,100);
	    p.add(new Label("this is a string inside panel",Label.CENTER));
	    f.add(p);
	    p2.add(new Button("clk here"));
	    p2.setBackground(Color.red);
	    f.add(p2);


	    
	}

}
