import java.awt.*;
public class LabelDemo{
	public static void main(String[] args) {
		Frame f= new Frame();
		f.setVisible(true);
	    f.setBackground(Color.white);
	    f.setSize(200,300);
	    f.setLayout(new GridLayout(6,2));
	    Label l =new Label("this is it",Label.CENTER);
	    f.add(l);
	    
	}

}